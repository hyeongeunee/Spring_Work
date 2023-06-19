package com.gura.spring.member.dao;

import com.gura.spring.member.dto.MemberDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//component scan 시 bean 이 되기 위해
@Repository
public class MemberDaoImpl implements MemberDao{
    //Dao 는 Repository 어노테이션을 주로 붙임
    //MyBatis 를 사용하기 위한 핵심 의존객체 주입 받기
    @Autowired
    private SqlSession session;

    @Override
    public void insert(MemberDto dto) {
        session.insert("member.insert", dto);
    }

    @Override
    public void update(MemberDto dto) {

    }

    @Override
    public void delete(int num) {

    }

    @Override
    public MemberDto getData(int num) {
        return null;
    }

    @Override
    public List<MemberDto> getList() {
        List<MemberDto> list = session.selectList("member.getList");
        //리턴해주기
        return list;
    }
}
