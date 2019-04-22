package com.wuxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wuxy
 * @create: 2019-04-22 10:06
 **/
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("执行了index业务方法");
        return "index";
    }

}
