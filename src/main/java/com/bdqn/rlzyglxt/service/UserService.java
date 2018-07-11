package com.bdqn.rlzyglxt.service;

import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.pojo.dbrl;

import java.util.List;

public interface UserService {

    dbrl findUser(String userName, String passWord);
}
