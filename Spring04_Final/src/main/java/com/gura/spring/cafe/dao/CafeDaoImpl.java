package com.gura.spring.cafe.dao;

import com.gura.spring.cafe.dto.CafeDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CafeDaoImpl implements CafeDao {
    @Autowired
    private SqlSession session;

    @Override
    public List<CafeDto> getList(CafeDto dto) {
        return null;
    }

    @Override
    public int getCount(CafeDto dto) {
        return 0;
    }

    @Override
    public void insert(CafeDto dto) {

    }

    @Override
    public CafeDto getData(int num) {
        return null;
    }

    @Override
    public CafeDto getData(CafeDto dto) {
        return null;
    }

    @Override
    public void addViewCount(int num) {

    }

    @Override
    public void delete(int num) {

    }

    @Override
    public void update(CafeDto dto) {

    }
}