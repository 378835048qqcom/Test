package com.main.test.controller;

import com.main.test.enetity.User;
import com.main.test.repository.UserRepository;
import com.main.test.service.impl.UserserviceImpl;
import com.main.test.util.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * @ClassName RabbmqController
 * @Author WangLu
 * @Date 2019/3/7
 **/
@Controller
public class RabbmqController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserserviceImpl userservice;

    @Autowired
    private HelloSender helloSender;

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     **/
    @ResponseBody
    @RequestMapping("/rabbmq")
    public Optional<User> rabbmq(long id) {
        for (int i = 0; i < 10 ; i ++) {
            helloSender.send();
        }
        Optional<User> user = userRepository.findById(id);
        return user;
    }

}
