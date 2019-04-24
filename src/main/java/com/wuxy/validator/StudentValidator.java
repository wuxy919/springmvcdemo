package com.wuxy.validator;

import com.wuxy.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author: wuxy
 * @create: 2019-04-24 14:54
 **/
public class StudentValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // 验证name不能为空
        ValidationUtils.rejectIfEmpty(errors, "name", null, "姓名不能为空");
        // 验证age不能为空
        ValidationUtils.rejectIfEmpty(errors, "age", null, "年龄不能为空");
    }
}
