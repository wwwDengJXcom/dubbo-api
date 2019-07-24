package com.czh.dubbo.common.entity;

import java.io.Serializable;

/**
 * Created by deng_ on 2019/5/16.
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    String userName;
    String sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
