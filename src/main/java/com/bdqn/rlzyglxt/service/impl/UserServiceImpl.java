package com.bdqn.rlzyglxt.service.impl;

import com.bdqn.rlzyglxt.dao.UserDao;
import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.pojo.dbrl;
import com.bdqn.rlzyglxt.service.UserService;
import org.apache.catalina.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public dbrl findUser(String userName, String passWord) {
        return this.userDao.findUser(userName, passWord);
    }
}
