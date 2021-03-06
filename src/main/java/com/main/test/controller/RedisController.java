package com.main.test.controller;

import com.main.test.enetity.User;
import com.main.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Optional;
import java.util.UUID;

/**
 * @ClassName RedisController
 * @Author WangLu
 * @Date 2019/3/7
 **/
@Controller
public class RedisController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    @Cacheable(value="user",key="#id")
    public Optional<User> getUser(long id) {
        Optional<User> user = userRepository.findById(id);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/30
     * @param session
     * @return java.lang.String
     **/
    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        session.setAttribute("name","ass");
        return session.getId();
    }

    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/30
     * @param session
     * @return java.lang.String
     **/
    @RequestMapping("/uid2")
    public String uid2(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            return "null";
        }
        return (String)session.getAttribute("name");
    }

}
