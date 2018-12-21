package com.atguigu.service;

import com.atguigu.bean.User;

/**
 * @author hanxn
 * @date 2018/12/21
 */
public interface LoginService {
     boolean checkUser(User user) throws Exception;
}
