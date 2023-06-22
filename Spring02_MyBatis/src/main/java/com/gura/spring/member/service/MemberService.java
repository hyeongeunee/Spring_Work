package com.gura.spring.member.service;

import com.gura.spring.member.dto.MemberDto;
import org.springframework.web.servlet.ModelAndView;

public interface MemberService {
    public void addMember(MemberDto dto);
    public void updateMember(MemberDto dto);
    public void deleteMember(int num);
    public void getMemberInfo(ModelAndView mView, int num);
    public void getMemberList(ModelAndView mView);

}
