package com.main.test.repository;

import com.main.test.enetity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Author WangLu
 * @Date 2019/1/29
 **/
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * @Author WangLu
     * @Description //TODO 
     * @Date 2019/1/29
     * @param null
     * @return 
     **/
    User findByUserName(String userName);
    
    /**
     * @Author WangLu
     * @Description //TODO
     * @Date 2019/1/29
     * @param null
     * @return 
     **/
    User findByUserNameOrEmail(String username, String email);
    
}
