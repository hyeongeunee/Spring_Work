package com.gura.spring.guest.dao;

import com.gura.spring.guest.dto.GuestDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// component scan
@Repository
public class GuestDaoImpl implements GuestDao { // GuestDaoImpl type X >> GuestDao type O >> 직접적인 의존도 x, 관계를 느슨하게 하기 위해서..

    // mybatis 기반으로 DB 연동을 하기 위한 핵심 의존객체를 Dependency Injection 받는다.
    @Autowired
    private SqlSession session;

    @Override
    /*
        Mapper's namespace => guest
        sql's id => insert
        parameterType => GuestDto
    */
    public void insert(GuestDto dto) {
        session.insert("guest.insert", dto);
    }

    @Override
    public void delete(GuestDto dto) {
        session.delete("guest.delete", dto);
    }

    @Override
    public void update(GuestDto dto) {
        session.update("guest.update", dto);
    }

    @Override
    public GuestDto getData(int num) {
        /*
            Mapper's namespace => guest
            sql's id => getData
            parameterType => int
            resultType => GuestDto
        */
        return session.selectOne("guest.getData", num);
    }

    @Override
    public List<GuestDto> getList() {
       /*
            Mapper's namespace => guest
            sql's id => getData
            parameterType => x
            resultType => GuestDto
        */
        return session.selectList("guest.getList");
    }
}
