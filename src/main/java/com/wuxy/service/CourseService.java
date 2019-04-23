package com.wuxy.service;

import com.wuxy.entity.Course;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-23 15:08
 **/
public interface CourseService {
    public Collection<Course> findAll();
    public Course find(int id);
    public void saveOrUpdate(Course course);
    public void delete(int id);
}
