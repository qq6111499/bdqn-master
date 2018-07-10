package com.bdqn.rlzyglxt.contoller;

import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.service.StudentService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/insert.do")
    public void insertStudent(Student student){
        studentService.intStudent(student);
    }

    @RequestMapping("/get1.do")
    public List<Student> selectStuAll(){
        return this.studentService.selectStudentAll();
    }
}
