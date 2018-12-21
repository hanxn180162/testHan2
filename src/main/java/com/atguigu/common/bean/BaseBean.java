package com.atguigu.common.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hanxn
 * @date 2018/12/21
 */
@Data
public class BaseBean implements Serializable {
    /**
     * 创建时间
     */
    private Data creaTime;
    /**
     * 修改时间
     */
    private Data modifyTime;
}
