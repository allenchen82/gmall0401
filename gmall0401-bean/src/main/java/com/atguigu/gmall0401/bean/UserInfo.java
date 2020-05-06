package com.atguigu.gmall0401.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    public String getPasswd() {
        return passwd;
    }

    @Column
    private String loginName;
    @Column
    private String nickName;

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;

    public void setId(String id) {
        this.id = id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    @Column
    private String headImg;
    @Column
    private String userLevel;

    public String getId() {
        return id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }
}
