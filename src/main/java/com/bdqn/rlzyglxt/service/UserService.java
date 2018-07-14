package com.bdqn.rlzyglxt.service;

import com.bdqn.rlzyglxt.pojo.Users;

import java.util.List;

public interface UserService {

    Users findUser(String userName, String passWord);

    /*
   * 查看人员信息
   * */
    List<Users> selectUsersAll();

    /*
    * 增加人员信息
    * */
    void insertUsers(Users users);
}
