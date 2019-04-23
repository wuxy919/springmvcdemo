package com.wuxy.repository;

import com.wuxy.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: wuxy
 * @create: 2019-04-23 15:03
 **/
@Repository
public class CourseRepository {
    private Map<Integer, Course> courseMap = new HashMap<>();

    public CourseRepository() {
        courseMap.put(1, new Course(1, "java基础", 2000));
        courseMap.put(2, new Course(2, "java高级", 3000));
    }

    public Collection<Course> findAll() {
        return courseMap.values();
    }

    public Course find(int id) {
        return courseMap.get(id);
    }

    public void saveOrUpdate(Course course) {
        courseMap.put(course.getId(), course);
    }

    public void delete(int id) {
        courseMap.remove(id);
    }
}
