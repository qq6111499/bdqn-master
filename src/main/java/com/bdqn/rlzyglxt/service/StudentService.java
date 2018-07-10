package com.bdqn.rlzyglxt.service;

import com.bdqn.rlzyglxt.pojo.Student;

import java.util.List;

public interface StudentService {
    void intStudent(Student student);

    List<Student> selectStudentAll();
}
