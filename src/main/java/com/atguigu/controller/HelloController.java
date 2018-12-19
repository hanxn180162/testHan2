package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hanxn
 * @date 2018/12/19
 */
@Controller
@RequestMapping("/API")
public class HelloController {
    @RequestMapping("/hello")
    public void hello(HttpServletRequest request){
        String empName = request.getParameter("empName");
        System.out.println("hannnnnnnnnnn");
        System.out.println("hannnnnnnnnnn");
        System.out.println("empName:"+empName);

    }
}
