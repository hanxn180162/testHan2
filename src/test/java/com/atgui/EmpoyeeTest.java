package com.atgui;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanxn
 * @date 2018/12/19
 */
public class EmpoyeeTest {
    private ApplicationContext iocContainer = new ClassPathXmlApplicationContext("config/spring-context.xml");
    private EmployeeService employeeService = iocContainer.getBean(EmployeeService.class);

    @Test
    public void testSelectOne() {

        //1.创建封装查询条件的实体类对象
        Employee employeeQueryCondition = new Employee(null, "han", null, null);

        //2.执行查询
        Employee employeeQueryResult = employeeService.getOne(employeeQueryCondition);

        //3.打印
        System.out.println(employeeQueryResult);
    }


}
