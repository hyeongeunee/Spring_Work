package com.gura.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AcornController {

    @RequestMapping( "/person/today" )
    public String showPerson(HttpServletRequest request) {
        String person="세종대왕";

        request.setAttribute( "personToday" , person);

        return "person";
    }
}