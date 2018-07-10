package com.bdqn.rlzyglxt.dao;

import com.bdqn.rlzyglxt.pojo.Student;

import java.util.List;

public interface StudentDao {
    void intStudent(Student student);

    List<Student> selectStudentAll();

}
