package com.bdqn.rlzyglxt.dao;

import com.bdqn.rlzyglxt.pojo.Stipend;

import java.util.List;

public interface StipendDao {
    /*
    * 浏览应聘信息
    * */
    List<Stipend> selectStipendAll();

    /*
    * 添加应聘信息
    * */
    void insertStipend(Stipend stipend);


}
