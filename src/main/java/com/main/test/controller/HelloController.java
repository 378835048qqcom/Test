package com.main.test.controller;

import com.main.test.enetity.User;
import com.main.test.repository.UserRepository;
import com.main.test.service.impl.UserserviceImpl;
import com.main.test.util.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

/**
 * @ClassName index
 * @Author WangLu
 * @Date 2019/1/29
 **/
@Controller
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserserviceImpl userservice;

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     **/
    @RequestMapping("/hello")
    public String hello(Model model, long id) {
        User user = userRepository.findById(id).get();
        model.addAttribute("user", user);
        model.addAttribute("name", "123");
        return "/hello";
    }

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     **/
    @ResponseBody
    @RequestMapping("/indexbody")
    public Optional<User> indexbody(long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     **/
    @ResponseBody
    @RequestMapping("/add")
    public Optional<User> add(long id) {
        userservice.list();
        Optional<User> user = userRepository.findById(id);
        return user;
    }

}
