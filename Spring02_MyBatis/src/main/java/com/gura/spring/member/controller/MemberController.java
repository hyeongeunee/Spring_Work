package com.gura.spring.member.controller;

import com.gura.spring.member.dao.MemberDao;
import com.gura.spring.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberDao dao;          //Spring bean Container 로부터 new MemberDaoImpl() 이 주입

    //회원 추가 요청처리
    @RequestMapping("/member/insert")
    public String insert(MemberDto dto){
        //MemberDao 객체를 이용해서 DB 에 저장
        dao.insert(dto);
        // view page 로 forward 이동해서 응답
        return "member/insert";
    }

    //회원 추가 폼 요청 처리
    @RequestMapping("/member/insertform")
    public String insertform(){
        // /WEB-INF/view/member/insertform.jsp 페이지로 forward 이동해서 응답
        return "member/insertform";
    }

    //회원 목록 보기 요청 처리
    @RequestMapping("/member/list")
    public String list(HttpServletRequest request){
        //회원 목록을 얻어와서
        List<MemberDto> list = dao.getList();
        //request scope 에 담고
        request.setAttribute("list", list);
        // /WEB-INF/view/member/list.jsp 페이지로 forward 이동해서 응답
        return "member/list";
    }
}
