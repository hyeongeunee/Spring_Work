package com.gura.spring.gallery.dao;

import com.gura.spring.gallery.dto.GalleryDto;

import java.util.List;

public interface GalleryDao {
    public List<GalleryDto> getList(GalleryDto dto);

    public void insert(GalleryDto dto);

    public GalleryDto getData(int num);

    public GalleryDto getData(GalleryDto dto);

    public void delete(int num);

    public void update(GalleryDto dto);

    public int getCount(GalleryDto dto);
}
