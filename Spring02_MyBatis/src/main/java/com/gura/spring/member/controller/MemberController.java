package com.gura.spring.member.controller;

import com.gura.spring.member.dao.MemberDao;
import com.gura.spring.member.dto.MemberDto;
import com.gura.spring.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberService service;          // Spring bean Container 로부터 new MemberDaoImpl() 이 주입

    // 회원 추가 요청처리
    @RequestMapping("/member/insert")
    public String insert(MemberDto dto) {
        // MemberDao 객체를 이용해서 DB 에 저장
        service.addMember(dto);
        // view page 로 forward 이동해서 응답
        return "member/insert";
    }

    // 회원 추가 폼 요청 처리
    @RequestMapping("/member/insertform")
    public String insertform() {
        // /WEB-INF/view/member/insertform.jsp 페이지로 forward 이동해서 응답
        return "member/insertform";
    }

    // 회원 목록 보기 요청 처리
    @RequestMapping("/member/list")
    public ModelAndView list(ModelAndView mView) {
        // 회원 목록을 얻어와서
        // List<MemberDto> list = dao.getList();
        service.getMemberList(mView);
        // request scope 에 담고
        // request.setAttribute("list", list);
        mView.setViewName("member/list");
        // /WEB-INF/view/member/list.jsp 페이지로 forward 이동해서 응답
        return mView;
    }

    /*
        @RequestParam (value="파라미터 명", defaultValue = "기본값")
        기본값은 없어도 되고 파라미터명과 매개변수명이 일치한다면 생략가능
     */

    // 회원 삭제 요청처리
    @RequestMapping("/member/delete")
    public String delete(@RequestParam(value = "num", defaultValue = "0") int num) {
        // MemberDao 객체를 이용해서 삭제
        service.deleteMember(num);
        // 목록보기로 리다일렉트 응답
        return "redirect:/member/list";
    }
    /*
        @RequestMapping(value = "/member/delete/{id}")
        public String delete(@PathVariable("num") int num) {
            // 삭제 작업 수행
            dao.delete(num);
            return "redirect:/member/list";
        }
    */

    // 회원 수정폼 요청 처리
    @RequestMapping("/member/updateform")
    public ModelAndView updateform(ModelAndView mView, int num) {
        // 수정할 회원의 정보를 얻어온다.
        //MemberDto dto = dao.getData(num);
        service.getMemberInfo(mView, num);
        /*
            수정할 회원의 정보를 ModelAndView 객체의 addObject(key, value) 메소드를 이용해서 담는다.
            ModelAndView 객체에 담은 값은 결국 HttpServletRequest 객체에 담는다. (request scope 에 담긴다)
         */
        //mView.addObject("dto", dto);
        // view page 의 위치도 ModelAndView 객체에 담아서 리턴해야 한다.
        mView.setViewName("member/updateform");
        // 모델(data) 와 view page 의 정보가 모두 담긴 ModelAndView 객체를 리턴해주면
        // spring 이 알아서 처리해준다.
        return mView;
    }

    /*
        @RequestMapping 에 method 속성의 값을 명시하지 않으면 요청 방식을 가리지 않고
        경로만 맞으면 모두 처리해준다. (GET or POST or PUT or DELETE)

        method 속성의 값을 명시하면 경로가 맞더라도 요청 방식이 다르면 처리해주지 않는다.
        일반적으로 POST 인 경우에는 요청방식을 명시해주는 것이 좋다.
     */

    // 회원 수정 요청처리
    @RequestMapping(method = RequestMethod.POST, value = "/member/update")
    public String update(@ModelAttribute(value = "dto") MemberDto dto) {
        service.updateMember(dto);
        return "member/update";
    }
}
