package com.bdqn.rlzyglxt.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "dbrl")
public class dbrl {
    /*
    * 标志列
    * */
    @Id
    private Integer id;
    /*
   * 员工用户名
   * */
    private String userName;
    /*
   * 登录密码
   * */
    private String password;
    /*
   * 员工性别
   * */
    private String sex;
    /*
   * 出生日期
   * */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;
    /*
   * 创建时间
   * */
    private String createTime;
    /*
   * 是否为管理员
   * */
    private String isadmin;
    /*
   * 人员简介
   * */
    private String conText;

    /*
   * 应聘人员编号
   * */
    private Integer applicantId;
    /*
      * 应聘人员名字
      * */
    private String applicanName;
    /*
     * 应聘人员性别
     * */
    private String applicanSex;
    /*
     * 应聘人员年龄
     * */
    private String applicanAge;
    /*
     * 应聘人员职位
     * */
    private String applicanJob;
    /*
     * 应聘人员所学专业
     * */
    private String applicanspeciaty;
    /*
     * 应聘人员工作经验
     * */
    private String applicanExoerience;
}
