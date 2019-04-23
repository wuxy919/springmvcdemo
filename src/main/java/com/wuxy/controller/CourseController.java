package com.wuxy.controller;

import com.wuxy.entity.Course;
import com.wuxy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: wuxy
 * @create: 2019-04-23 15:12
 **/
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", courseService.findAll());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Course course) {
        courseService.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        courseService.delete(id);
        return "redirect:/course/findAll";
    }

    @GetMapping("/find/{id}")
    public ModelAndView find(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("course", courseService.find(id));
        return modelAndView;
    }

    @PutMapping("/update")
    public String update(Course course) {
        courseService.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }
}
