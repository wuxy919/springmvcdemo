package com.wuxy.controller;

import com.wuxy.entity.Admin;
import com.wuxy.entity.User2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author: wuxy
 * @create: 2019-04-24 10:13
 **/
@Controller
public class ValidatorController {

//    @GetMapping("login")
//    public String login(Model model) {
//        model.addAttribute(new Admin());
//        return "login";
//    }
//
//    @PostMapping("login")
//    public String login(@Validated Admin admin, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "login";
//        }
//        return "index";
//    }

    @GetMapping("register")
    public String register(Model model) {
        model.addAttribute(new User2());
        return "register";
    }

    @PostMapping("register")
    public String register(@Valid User2 user2, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        }
        return "index";
    }

}
