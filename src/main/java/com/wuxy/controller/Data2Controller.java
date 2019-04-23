package com.wuxy.controller;

import com.wuxy.entity.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-23 16:42
 **/
@Controller
@RequestMapping("/data2")
public class Data2Controller {

    @RequestMapping("/map")
    public String map(Map<String, Course> map) {
        Course course = new Course(1, "Java架构", 6500);
        map.put("c1", course);
        return "test";

    }

    @RequestMapping("/model")
    public String model(Model model) {
        Course course = new Course(1, "Java架构", 6500);
        model.addAttribute("c1", course);
        return "test";
    }

    @RequestMapping("/mav1")
    public ModelAndView modelAndView1() {
        ModelAndView modelAndView = new ModelAndView();
        Course course = new Course(1, "Java架构", 6500);
        modelAndView.setViewName("test");
        modelAndView.addObject("c1", course);
        return modelAndView;
    }

    @RequestMapping("/mav2")
    public ModelAndView modelAndView2() {
        ModelAndView modelAndView = new ModelAndView();
        Course course = new Course(1, "Java架构", 6500);
        View view = new InternalResourceView("/test.jsp");
        modelAndView.setView(view);
        modelAndView.addObject("c1", course);
        return modelAndView;
    }

    @RequestMapping("/mav3")
    public ModelAndView modelAndView3() {
        ModelAndView modelAndView = new ModelAndView("test");
        Course course = new Course(1, "Java高级", 6500);
        modelAndView.addObject("c1", course);
        return modelAndView;
    }

    @RequestMapping("/mav4")
    public ModelAndView modelAndView4() {
        View view = new InternalResourceView("/test.jsp");
        ModelAndView modelAndView = new ModelAndView(view);
        Course course = new Course(1, "Java架构", 6500);
        modelAndView.addObject("c1", course);
        return modelAndView;
    }

    @RequestMapping("/mav5")
    public ModelAndView modelAndView5() {
        Map<String, Course> map = new HashMap<>();
        Course course = new Course(1, "Java基础", 6500);
        map.put("c1", course);
        ModelAndView modelAndView = new ModelAndView("test", map);
        return modelAndView;
    }

    @RequestMapping("/mav6")
    public ModelAndView modelAndView6() {
        Map<String, Course> map = new HashMap<>();
        Course course = new Course(1, "Java web基础", 6500);
        map.put("c1", course);
        View view = new InternalResourceView("/test.jsp");
        ModelAndView modelAndView = new ModelAndView(view, map);
        return modelAndView;
    }

    @RequestMapping("/mav7")
    public ModelAndView modelAndView7() {
        Course course = new Course(1, "Java web基础", 6500);
        ModelAndView modelAndView = new ModelAndView("test", "c1", course);
        return modelAndView;
    }

    @RequestMapping("/mav8")
    public ModelAndView modelAndView8() {
        Course course = new Course(1, "Java Spring框架", 6500);
        View view = new InternalResourceView("/test.jsp");
        ModelAndView modelAndView = new ModelAndView(view, "c1", course);
        return modelAndView;
    }

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        Course course = new Course(1, "Java基础", 6500);
        request.setAttribute("c1", course);
        HttpSession session = request.getSession();
        session.setAttribute("c1", course);
        return "test";
    }

}
