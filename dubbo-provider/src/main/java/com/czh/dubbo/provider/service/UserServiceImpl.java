package com.czh.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.czh.dubbo.common.entity.User;
import com.czh.dubbo.common.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by deng_ on 2019/5/16.
 */
@Service
public class UserServiceImpl implements UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User getUser(User user){
        logger.info("userName："+user.getUserName()+"，sex：" + user.getSex());
        return user;
    }
}
