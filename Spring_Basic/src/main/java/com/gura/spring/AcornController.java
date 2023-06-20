package com.gura.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AcornController {

    @RequestMapping("/test/friend")
    public ModelAndView friends(ModelAndView mView) {

        List<String> names=new ArrayList<String>();
        names.add("김구라");
        names.add("해골");
        names.add("원숭이");

        mView.addObject("names", names);
        mView.setViewName( "/test/friend" );

        return mView ;
    }
}