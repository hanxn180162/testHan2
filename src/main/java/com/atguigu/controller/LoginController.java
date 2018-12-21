package com.atguigu.controller;

import com.atguigu.bean.User;
import com.atguigu.common.code.ErrorCode;
import com.atguigu.common.utils.Validate;
import com.atguigu.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author hanxn
 * @date 2018/12/21
 */
@RequestMapping("/user")
@Controller
@Slf4j
public class LoginController {
    @Autowired
    private LoginService loginService;
    public static final String CLASS_NAME = "LoginController";
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        String methodName = "login()";
        try {
            //校验登陆用户名和密码
            String user = request.getParameter("user");
            String password = request.getParameter("password");
            if (StringUtils.isBlank(user)) {
                request.setAttribute("message", ErrorCode.ERROR_CODE_1113.getMessage());
                return "/user/login";
            }
            if (StringUtils.isBlank(password)) {
                request.setAttribute("message", ErrorCode.ERROR_CODE_1114.getMessage());
                return "/user/login";
            }
            User inParam = new User();

            if (Validate.validatePhone(user)) {
                inParam.setUserPhone(user);
            } else {
                inParam.setUserName(user);
            }
            inParam.setPassWord(password);
            if (loginService.checkUser(inParam)) {
                HttpSession session = request.getSession();
                session.setAttribute("userSession",inParam);
            } else {
                request.setAttribute("message", ErrorCode.ERROR_CODE_1115.getMessage());
                return "/user/login";
            }
            return "/user/login";
        } catch (Exception e) {
            log.error(CLASS_NAME,methodName+"异常：",e);
        }
        return "";
    }
}
