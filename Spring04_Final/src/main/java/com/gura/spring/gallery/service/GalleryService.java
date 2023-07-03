package com.gura.spring.gallery.service;

import com.gura.spring.gallery.dto.GalleryDto;

import javax.servlet.http.HttpServletRequest;

public interface GalleryService {
    public void getList(HttpServletRequest request);

    public void getDetail(HttpServletRequest request);

    public void saveImage(GalleryDto dto);

    public void updateImage(GalleryDto dto);

    public void deleteImage(int num, HttpServletRequest request);

    public void getData(HttpServletRequest request);
}
