package com.atguigu.controller;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hanxn
 * @date 2018/12/19
 */
@Controller
@RequestMapping("/API")
public class HelloController {
    @Autowired
    private EmployeeService employeeService;
//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, ModelMap map){
        String empName = request.getParameter("empName");
        Employee employee =new Employee(null,empName,null,null);
        Employee one = employeeService.getOne(employee);
        map.put("emp",one);
       return "queryEmployeeList";

    }
}
