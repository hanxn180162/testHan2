package com.atguigu.bean;

import com.atguigu.common.bean.BaseBean;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Table;

/**
 * @author hanxn
 * @date 2018/12/21
 */
@Data
@Table(name ="tbl_user")
@Validated
public class User extends BaseBean {
    /**
     * 用户ID
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户别名
     */
    private String userAlias;
    /**
     * 用户证件ID
     */
    private String userIdCard;
    /**
     * 户籍所在地
     */
    private String userDomicile;
    /**
     * 用户地址
     */
    private String userAddr;
    /**
     * 用户手机
     */
    private String userPhone;

    /**
     * 密码
     */
    private String passWord;

}
