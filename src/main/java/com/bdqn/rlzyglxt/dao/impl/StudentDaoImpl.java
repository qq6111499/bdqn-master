package com.bdqn.rlzyglxt.dao.impl;

import com.bdqn.rlzyglxt.dao.StudentDao;
import com.bdqn.rlzyglxt.pojo.Student;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public void intStudent(Student student) {
        mongoTemplate.insert(student);
    }

    @Override
    public List<Student> selectStudentAll() {
        return this.mongoTemplate.findAll(Student.class);
    }
}
