package com.atguigu.service;

import com.atguigu.bean.Employee;
import com.atguigu.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hanxn
 * @date 2018/12/19
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee getOne (Employee in){
        return employeeMapper.selectOne(in);
    }

}
