/**
* @author yshhuang@foxmail.com
* @date 3/16/2021
*/
package com.yshhuang.multidatasource.mapper.staff;

import com.yshhuang.multidatasource.entity.Student;

import org.apache.ibatis.annotations.Insert;

public interface StudentMapper {
    
    @Insert("insert into student(name) values(#{name})")
    Integer addStudent(Student student);
}
