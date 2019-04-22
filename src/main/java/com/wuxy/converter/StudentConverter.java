package com.wuxy.converter;

import com.wuxy.entity.Student;
import org.springframework.core.convert.converter.Converter;

/**
 * @author: wuxy
 * @create: 2019-04-22 17:41
 **/
public class StudentConverter implements Converter<String, Student> {
    @Override
    public Student convert(String source) {
        String[] args = source.split("-");
        Student student = new Student();
        student.setId(Integer.parseInt(args[0]));
        student.setName(args[1]);
        student.setAge(Integer.parseInt(args[2]));
        return student;
    }
}
