package com.gura.spring.gallery.controller;

import com.gura.spring.gallery.dto.GalleryDto;
import com.gura.spring.gallery.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class GalleryController {
    @Autowired
    private GalleryService service;

    @RequestMapping("/gallery/list")
    public String getList(HttpServletRequest request) {
        service.getList(request);
        return "gallery/list";
    }

    @RequestMapping("/gallery/upload_form")
    public String uploadForm() {
        return "gallery/upload_form";
    }


    @RequestMapping("/gallery/upload")
    public String upload(GalleryDto dto, HttpSession session) {
        String writer = (String) session.getAttribute("id");
        dto.setWriter(writer);
        service.saveImage(dto);
        return "gallery/upload";
    }

    @RequestMapping("/gallery/detail")
    public String detail(HttpServletRequest request) {
        service.getDetail(request);
        return "gallery/detail";
    }

    @RequestMapping("/gallery/delete")
    public String delete(int num, HttpServletRequest request) {
        service.deleteImage(num, request);
        return "redirect:/gallery/list";
    }

    @RequestMapping("/gallery/update_form")
    public String updateForm(HttpServletRequest request) {
        service.getData(request);
        return "gallery/update_form";
    }

    @RequestMapping("/gallery/update")
    public String update(GalleryDto dto) {
        service.updateImage(dto);
        return "gallery/update";
    }
}
