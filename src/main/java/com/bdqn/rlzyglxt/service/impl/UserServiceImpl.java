package com.bdqn.rlzyglxt.service.impl;

import com.bdqn.rlzyglxt.dao.UserDao;
import com.bdqn.rlzyglxt.pojo.Users;
import com.bdqn.rlzyglxt.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public Users findUser(String userName, String passWord) {
        return this.userDao.findUser(userName, passWord);
    }

    @Override
    public List<Users> selectUsersAll() {
        System.out.println("1");
        return userDao.selectUsersAll();
    }

    @Override
    public void insertUsers(Users users) {
        this.userDao.insertUsers(users);
    }
}
