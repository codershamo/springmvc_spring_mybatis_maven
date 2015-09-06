package com.ssmm.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sha on 2015/9/4.
 */
public class CrossDomainInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        response.addHeader("Access-Control-Allow-Origin","*");

        response.addHeader("Access-Control-Allow-Methods","*");

        response.addHeader("Access-Control-Max-Age","100");

        response.addHeader("Access-Control-Allow-Headers", "Content-Type");

        response.addHeader("Access-Control-Allow-Credentials","false");

        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }
}
