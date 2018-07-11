package com.bdqn.rlzyglxt.contoller;

import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.pojo.dbrl;
import com.bdqn.rlzyglxt.service.UserService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;



    @RequestMapping(value = "/login.do")
    public dbrl license(HttpServletResponse response, String userName, String passWord) {
        response.setHeader("Access-Control-Allow-Origin", "*");//解决跨域请求
        return userService.findUser(userName, passWord);
    }

}
