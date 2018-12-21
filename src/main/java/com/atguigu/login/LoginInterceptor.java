package com.atguigu.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author hanxn
 * @date 2018/12/21
 */
@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {
    /**
     * 在Controller方法前进行拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) {
        log.info("自定义拦截器=============start");
        //判断用户是否登陆，登陆直接放行，如若不是登陆就会校验session等信息
        String contextPath = request.getContextPath();
        String requestURI = request.getRequestURI();
        if("/user/login".equalsIgnoreCase(requestURI)){
            log.info("用户请求登陆");
            return true;
        }
        log.info("自定义拦截器=============end");
        return false;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) {
        System.out.println("ControllerInterceptor.postHandle()");
    }
    /**
     * 在Controller方法后进行拦截
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            {
        System.out.println("ControllerInterceptor.afterCompletion()");
    }

}
