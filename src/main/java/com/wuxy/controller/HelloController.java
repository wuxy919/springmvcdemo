package com.wuxy.controller;

import com.wuxy.entity.Address;
import com.wuxy.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-22 10:06
 **/
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("执行了index业务方法");
        return "index";
    }

    @GetMapping("get")
    public String get(Model model) {
        Student student = new Student();
        student.setId(1);
        student.setName("tom");
        student.setPassword("111111");
        student.setAge(30);
        student.setGender("男");
        student.setFlag(true);
        String[] hobby = {"读书","听音乐","看电影"};
        student.setHobby(hobby);
        List<String> hobbys = new ArrayList<>();
        hobbys.add("读书");
        hobbys.add("旅行");
        hobbys.add("听音乐");
        hobbys.add("看电影");
        hobbys.add("打游戏");
        student.setHobbys(hobbys);
        List<String> selectHobby = new ArrayList<>();
        selectHobby.add("读书");
        selectHobby.add("旅行");
        selectHobby.add("打游戏");
        student.setSelectHobby(selectHobby);
        student.setRodioId(1);
        Map<Integer, String> gradeMap = new HashMap<>();
        gradeMap.put(1, "大一");
        gradeMap.put(2, "大二");
        gradeMap.put(3, "大三");
        gradeMap.put(4, "大四");
        student.setGradeMap(gradeMap);
        student.setSelectGrade(3);
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(1, "北京");
        cityMap.put(2, "上海");
        cityMap.put(3, "广州");
        cityMap.put(4, "深圳");
        cityMap.put(5, "杭州");
        cityMap.put(6, "西安");
//        student.setCityMap(cityMap);
        student.setSelectCity(3);
        student.setIntroduce("Hello World!!!");
        Address address = new Address();
        address.setId(1);
        address.setName("科技路");
        student.setAddress(address);
        model.addAttribute("student", student);
        return "show2";
    }

    @GetMapping("/login")
    public String login(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student";
    }

    @PostMapping("/login")
    public String login(@Validated Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "student";
        }
        return "index";
    }

}
