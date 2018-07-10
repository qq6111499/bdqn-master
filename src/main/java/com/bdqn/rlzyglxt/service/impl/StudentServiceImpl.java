package com.bdqn.rlzyglxt.service.impl;

import com.bdqn.rlzyglxt.dao.StudentDao;
import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.service.StudentService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public void intStudent(Student student) {
         this.studentDao.intStudent(student);
    }

    @Override
    public List<Student> selectStudentAll() {
       return studentDao.selectStudentAll();
    }
}
