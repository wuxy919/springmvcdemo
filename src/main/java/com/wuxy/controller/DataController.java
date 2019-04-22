package com.wuxy.controller;

import com.wuxy.entity.User;
import com.wuxy.entity.UserList;
import com.wuxy.entity.UserMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: wuxy
 * @create: 2019-04-22 11:36
 **/
@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int num) {
        System.out.println(num + 1);
        return "num:" + num;
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "num",required = false, defaultValue = "1") Integer num) {
        return "num:" + num;
    }

    @RequestMapping("/arrayType")
    @ResponseBody
    public String arrayType(String[] name) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String item : name) {
            stringBuffer.append(item).append(" ");
        }
        return "name:" + stringBuffer.toString();
    }

    @RequestMapping("/listType")
    @ResponseBody
    public String listType(UserList userList) {
        StringBuffer stringBuffer = new StringBuffer();
        for (User user : userList.getUserList()) {
            stringBuffer.append(user).append(" ");
        }
        return "用户:" + stringBuffer.toString();
    }

    @RequestMapping("/mapType")
    @ResponseBody
    public String mapType(UserMap userMap) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String key : userMap.getUserMap().keySet()) {
            User user = userMap.getUserMap().get(key);
            stringBuffer.append(user).append(" ");
        }
        return "用户：" + stringBuffer.toString();
    }

}
