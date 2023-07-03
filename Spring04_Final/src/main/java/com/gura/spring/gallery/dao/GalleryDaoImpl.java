package com.gura.spring.gallery.dao;

import com.gura.spring.gallery.dto.GalleryDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GalleryDaoImpl implements GalleryDao {
    @Autowired
    private SqlSession session;

    @Override
    public List<GalleryDto> getList(GalleryDto dto) {
        return session.selectList("gallery.getList", dto);
    }

    @Override
    public void insert(GalleryDto dto) {
        session.insert("gallery.insert", dto);
    }

    @Override
    public GalleryDto getData(int num) {
        return session.selectOne("gallery.getData", num);
    }

    @Override
    public GalleryDto getData(GalleryDto dto) {
        return session.selectOne("gallery.getData2", dto);
    }

    @Override
    public void delete(int num) {
        session.delete("gallery.delete", num);
    }

    @Override
    public void update(GalleryDto dto) {
        session.update("gallery.update", dto);
    }

    @Override
    public int getCount(GalleryDto dto) {
        return session.selectOne("gallery.getCount", dto);
    }
}
