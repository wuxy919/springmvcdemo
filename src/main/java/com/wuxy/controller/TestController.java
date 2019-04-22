package com.wuxy.controller;

import com.wuxy.entity.Student;
import com.wuxy.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author: wuxy
 * @create: 2019-04-22 10:24
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("index...");
        return "index";
    }

    @RequestMapping("/rest/{name}/{id}")
    public String restful(@PathVariable("name") String name, @PathVariable("id") long id) {
        System.out.println(name);
        System.out.println(id);
        return "index";
    }

    @RequestMapping("/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String sessionid) {
        System.out.println(sessionid);
        return "index";
    }

    @RequestMapping("/add")
    public String addUser(User user) {
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/dateConverTest")
    public String getDate(Date date) {
        System.out.println(date);
        return "index";
    }

    @RequestMapping("/studentConverterTest")
    @ResponseBody
    public Student studentConverter(Student student) {
        return student;
    }

    @PutMapping("/httpPut/{id}/{name}")
    @ResponseBody
    public String httpPut(@PathVariable("id") int id, @PathVariable("name") String name) {
        return "id:" + id +"--name:" + name;
    }

    @DeleteMapping("/httpDelete")
    @ResponseBody
    public String httpDelete() {
        return "DELETE";
    }

}
