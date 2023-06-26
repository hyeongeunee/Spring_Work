package com.gura.spring.users.service;

import com.gura.spring.users.dto.UsersDto;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

public interface UsersService {
    public void addUser(UsersDto dto);
    public void loginProcess(UsersDto dto, HttpSession session);

}
