package com.atguigu.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hanxn
 * @date 2018/12/21
 */
@Slf4j
public class Validate {
    /**
     * 校验手机
     * @param phone
     * @return
     */
    public static boolean validatePhone(String phone){
        Pattern compile = Pattern.compile("(?<!\\d)(?:(?:1[23456789]\\d{9}))(?!\\d)");
        Matcher matcher = compile.matcher(phone);
        while (matcher.find()) {
            String p=   matcher.group();
            log.info("校验后的手机号："+p);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = Validate.validatePhone("1337020070");
        System.out.println("b:========"+b);
    }
}
