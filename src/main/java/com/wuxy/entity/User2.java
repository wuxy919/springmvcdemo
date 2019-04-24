package com.wuxy.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author: wuxy
 * @create: 2019-04-24 12:28
 **/
public class User2 {

    @NotEmpty(message = "用户名不能为空")
    private String username;

    @Size(min = 6, max = 20, message = "密码长度为6-20")
    private String password;

    @Email(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\\\.[a-zA-Z0-9-]+)*\\\\.[a-zA-Z0-9]{2,6}$", message = "请输入正确的邮箱格式")
    private String email;

    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15(0-3)|[5-9]))|(18[0,5-9])\\\\\\\\d{8}$", message = "请输入正确的电话号码")
    private String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}