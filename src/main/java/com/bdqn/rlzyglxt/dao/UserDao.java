package com.bdqn.rlzyglxt.dao;

import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.pojo.dbrl;

import java.util.List;

public interface UserDao {
    /*登录根据userName --password登录到主页*/
    dbrl findUser(String userName, String passWord);


}
