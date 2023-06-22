package com.gura.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
    [인터셉터 만들기]

    1. HandInterceptor 인터페이스를 구현해서 만든다.
    2. servlet-context.xml 에 bean 설정을 하고 interceptor 목록에 등록을 하고 맵핑을 해준다.

 */
public class MyInterceptor implements HandlerInterceptor {
    @Override // Controller 실행 이전에 호출되는 메소드
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //request scope 에 메세지 담기
        request.setAttribute("msg", "나는 인터셉터다 ~");
        System.out.println("preHandle()");
        /*
            true 를 리턴하면 계속 흐름을 이어가고 false 를 리턴하면 이어가지 않는다.
         */
        return true;
    }

    @Override // Controller 실행 이후에 호출되는 메소드
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView mView) throws Exception {
        System.out.println("postHandle()");
    }

    @Override // 응답된 이후에 호출되는 메소드
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion()");
    }
}
