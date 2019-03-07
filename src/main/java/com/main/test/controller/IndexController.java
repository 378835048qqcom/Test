package com.main.test.controller;

import com.main.test.enetity.User;
import com.main.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Optional;
import java.util.UUID;

/**
 * @ClassName index
 * @Author WangLu
 * @Date 2019/1/29
 **/
@RestController
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     **/
    @RequestMapping("/indexid")
    public Optional<User> index(long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     * @return
     **/
    @RequestMapping("/nologin")
    public String nologin() {
        return "nologin";
    }



}
