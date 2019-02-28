package com.main.test.enetity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName User
 * @Author WangLu
 * @Date 2019/1/29
 **/
public class UserMybatis {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String userName;

    private String passWord;

    private String email;

    private String nickName;

    private String regTime;

    private UserMybatis(Builder builder) {
        setId(builder.id);
        setUserName(builder.userName);
        setPassWord(builder.passWord);
        setEmail(builder.email);
        setNickName(builder.nickName);
        setRegTime(builder.regTime);
    }

    public UserMybatis() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }


    public static final class Builder {
        private Long id;
        private String userName;
        private String passWord;
        private String email;
        private String nickName;
        private String regTime;

        public Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withUserName(String val) {
            userName = val;
            return this;
        }

        public Builder withPassWord(String val) {
            passWord = val;
            return this;
        }

        public Builder withEmail(String val) {
            email = val;
            return this;
        }

        public Builder withNickName(String val) {
            nickName = val;
            return this;
        }

        public Builder withRegTime(String val) {
            regTime = val;
            return this;
        }

        public UserMybatis build() {
            return new UserMybatis(this);
        }
    }
}
