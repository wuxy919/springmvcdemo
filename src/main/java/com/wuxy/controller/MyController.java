package com.wuxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wuxy
 * @create: 2019-04-24 16:04
 **/
@Controller
public class MyController {

    @RequestMapping("/myIndex")
    public String myIndex() {
        return "myIndex";
    }
}
