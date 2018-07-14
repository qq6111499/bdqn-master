package com.bdqn.rlzyglxt.contoller;

import com.bdqn.rlzyglxt.pojo.Users;
import com.bdqn.rlzyglxt.service.UserService;
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
    public Users license(HttpServletResponse response, String userName, String passWord) {
        response.setHeader("Access-Control-Allow-Origin", "*");//解决跨域请求
        System.out.println("1");
        return userService.findUser(userName, passWord);
    }

    @RequestMapping(value = "/getAll.do")
    public List<Users> selectUsersAll(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");//解决跨域请求
        return userService.selectUsersAll();
    }

    @RequestMapping(value = "/insert.do")
    public void insertUsers(HttpServletResponse response,Users users){
        response.setHeader("Access-Control-Allow-Origin", "*");//解决跨域请求
         userService.insertUsers(users);
    }
}
