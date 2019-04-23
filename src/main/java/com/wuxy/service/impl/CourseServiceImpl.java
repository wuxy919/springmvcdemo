package com.wuxy.service.impl;

import com.wuxy.entity.Course;
import com.wuxy.repository.CourseRepository;
import com.wuxy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author: wuxy
 * @create: 2019-04-23 15:10
 **/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Collection<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course find(int id) {
        return courseRepository.find(id);
    }

    @Override
    public void saveOrUpdate(Course course) {
        courseRepository.saveOrUpdate(course);
    }

    @Override
    public void delete(int id) {
        courseRepository.delete(id);
    }
}
