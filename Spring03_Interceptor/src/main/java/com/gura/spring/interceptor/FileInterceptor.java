package com.gura.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

public class FileInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession();
        String id = (String) session.getAttribute("id");
        if (id == null) {
            String url = request.getRequestURI();
            String query = request.getQueryString();
            String encodedUrl = null;
            if (query == null) {
                encodedUrl = URLEncoder.encode(url);
            } else {
                encodedUrl = URLEncoder.encode(url + "?" + query);
            }
            String cPath = request.getContextPath();
            response.sendRedirect(cPath + "/users/loginform?url=" + encodedUrl);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
