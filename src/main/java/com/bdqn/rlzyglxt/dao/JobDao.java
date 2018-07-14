package com.bdqn.rlzyglxt.dao;

import com.bdqn.rlzyglxt.pojo.Job;

import java.util.List;

public interface JobDao {
    /*
    * 浏览应聘信息
    * */
    List<Job> selectJobAll();

    /*
    * 添加应聘信息
    * */
    void insertJob(Job job);


}
