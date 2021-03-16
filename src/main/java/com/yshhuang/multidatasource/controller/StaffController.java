/**
* @author yshhuang@foxmail.com
* @date 3/16/2021
*/
package com.yshhuang.multidatasource.controller;

import com.yshhuang.multidatasource.entity.Student;
import com.yshhuang.multidatasource.mapper.staff.StudentMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StudentMapper studentMapper;

    @PutMapping("student")
    public int addStudent(@RequestParam String name) {
        Student student = new Student();
        student.setName(name);
        return studentMapper.addStudent(student);
    }

}
