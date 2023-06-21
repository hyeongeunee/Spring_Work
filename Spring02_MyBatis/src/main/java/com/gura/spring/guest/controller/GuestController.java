package com.gura.spring.guest.controller;

import com.gura.spring.guest.dao.GuestDao;
import com.gura.spring.guest.dto.GuestDto;
import com.gura.spring.guest.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GuestController {
    @Autowired
    private GuestService service;

    @RequestMapping(method = RequestMethod.POST, value = "/guest/insert")
    public String insert(GuestDto dto){
        service.addGuest(dto);
        return "guest/insert";
    }

    @RequestMapping("/guest/insertform")
    public String insertform(){
        return "guest/insertform";
    }

    @RequestMapping("/guest/list")
    public ModelAndView list(ModelAndView mView){
        //방명록 목록 얻어오기
        List<GuestDto> list = service.getGuestList(mView);
        //ModelAndView 객체에 담고
        mView.addObject("list", list);
        //view page 정보 담기
        mView.setViewName("guest/list");
        /*
            두 개의 정보가 모두 담긴 ModelAndView 객체를 리턴해주면
            addObject(key, value) 를 통해서 담은 정보는 request scope 에 담기고
            setViewName(view page 위치)를 통해서 담은 정보는 해당 view page 로 forward 이동해서 응답된다.
            >> spring framework 가 해준다.
         */
        return mView;
    }

    @RequestMapping(value = "/guest/delete", method = RequestMethod.POST)
    public String delete(GuestDto dto) {
        // 삭제 작업 수행
        service.deleteGuest(dto);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/updateform")
    public ModelAndView updateform(ModelAndView mView, int num){
        //수정할 글 정보를 얻어와서
        //서비스를 이용해서 ModelAndView 객체에 글 하나의 정보를 담아온다.
        service.getGuestInfo(mView, num);
        //ModelAndView 객체에 담고
        //view page 로 forward 이동해서 수정폼 응답하기
        mView.setViewName("guest/updateform");
        return mView;
    }

    @RequestMapping(value = "/guest/update", method = RequestMethod.POST)
    public String update(@ModelAttribute(value = "dto") GuestDto dto){
        service.addGuest(dto);
        return "guest/update";
    }

}
