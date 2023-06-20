package com.gura.spring.guest.dao;

import com.gura.spring.guest.dto.GuestDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDaoImpl implements GuestDao{
    @Autowired
    private SqlSession session;


    @Override
    public void insert(GuestDto dto) {
        session.insert("guest.insert", dto);
    }

    @Override
    public void delete(int num) {
        session.delete("int num");
    }

    @Override
    public void update(GuestDto dto) {
        session.update("guest.update", dto);
    }

    @Override
    public GuestDto getData(int num) {
        return session.selectOne("guest.getData", num);
    }

    @Override
    public List<GuestDto> getList() {
        List<GuestDto> list = session.selectList("guest.getList");
        return list;
    }
}
