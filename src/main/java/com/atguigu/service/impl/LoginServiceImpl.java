package com.atguigu.service.impl;

import com.atguigu.bean.User;
import com.atguigu.mappers.UserMapper;
import com.atguigu.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hanxn
 * @date 2018/12/21
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
    public static final String CLASS_NAME = "LoginServiceImpl";
    @Autowired
    private UserMapper userMapper;
    public boolean checkUser(User user) throws Exception{
    String methodName = "checkUser()";
        try {
            int i = userMapper.selectCount(user);
            if (i > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            log.error(CLASS_NAME,methodName+"异常："+e);
            throw new Exception(e);
        }
    }
}
