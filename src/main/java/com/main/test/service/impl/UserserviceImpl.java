package com.main.test.service.impl;

import com.main.test.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @ClassName Userservice
 * @Author WangLu
 * @Date 2019/2/25
 **/
@Service
public class UserserviceImpl  {

    @Resource
    private UserMapper userMapper;

    public void list() {
        userMapper.add();
    }

}
