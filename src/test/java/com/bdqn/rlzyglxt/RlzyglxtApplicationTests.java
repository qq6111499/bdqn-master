package com.bdqn.rlzyglxt;

import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RlzyglxtApplicationTests {

    @Resource
    private StudentService studentService;

    @Test
    public void contextLoads() {

//        List<Student> list = this.studentService.selectStudentAll();
//        for (Student stus : list
//                ) {
//            System.out.println(stus.toString());
//        }
    }

}
