package com.bdqn.rlzyglxt.dao;

import com.bdqn.rlzyglxt.pojo.Users;

import java.util.List;

public interface UserDao {
    /*登录根据userName --password登录到主页*/
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
