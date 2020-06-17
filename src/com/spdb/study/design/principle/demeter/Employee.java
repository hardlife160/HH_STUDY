package com.spdb.study.design.principle.demeter;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Longyx
 * @date 2020年06月17日 15:38
 */
public class Employee {
    public void checkNumberOfCourses(){
        List<Course> courses = new ArrayList<>();
        for (int i=0; i<200; i++){
            courses.add(new Course());
        }
        System.out.println("当前学期选课总数为： "+courses.size());
    }
}
