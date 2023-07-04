package com.gura.spring.gallery.controller;

import com.gura.spring.gallery.dto.GalleryDto;
import com.gura.spring.gallery.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/gallery/upload_form2")
    public String uploadForm2() {
        return "gallery/upload_form2";
    }

    @RequestMapping("/gallery/upload_form3")
    public String uploadForm3() {
        return "gallery/upload_form3";
    }


    @RequestMapping("/gallery/upload")
    public String upload(GalleryDto dto, HttpServletRequest request) {
        // form 에서 dto 로 데이터 받아옴
        // dto : caption, MultipartFile image 를 가지고 있다.
        // request : imagePath 만드는데 사용, session 영역의 id 가져오는데 사용
        service.saveImage(dto, request);
        return "gallery/upload";
    }

    @RequestMapping(value = "/gallery/detail", method = RequestMethod.GET)
    public ModelAndView detail(ModelAndView mView, int num) {
        // 갤러리 detail 페이지에 필요한 data 를 num 으로 가져와 ModelAndView 에 저장
        service.getDetail(mView, num);
        mView.setViewName("gallery/detail");

        return mView;
    }

}
