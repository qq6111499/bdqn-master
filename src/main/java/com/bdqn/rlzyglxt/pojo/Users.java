package com.bdqn.rlzyglxt.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Date;

@Document(collection = "dbrl")
public class Users {
    /*
    * 标志列
    * */
    @Id
    private BigInteger id;
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

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public String getConText() {
        return conText;
    }

    public void setConText(String conText) {
        this.conText = conText;
    }

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicanName() {
        return applicanName;
    }

    public void setApplicanName(String applicanName) {
        this.applicanName = applicanName;
    }

    public String getApplicanSex() {
        return applicanSex;
    }

    public void setApplicanSex(String applicanSex) {
        this.applicanSex = applicanSex;
    }

    public String getApplicanAge() {
        return applicanAge;
    }

    public void setApplicanAge(String applicanAge) {
        this.applicanAge = applicanAge;
    }

    public String getApplicanJob() {
        return applicanJob;
    }

    public void setApplicanJob(String applicanJob) {
        this.applicanJob = applicanJob;
    }

    public String getApplicanspeciaty() {
        return applicanspeciaty;
    }

    public void setApplicanspeciaty(String applicanspeciaty) {
        this.applicanspeciaty = applicanspeciaty;
    }

    public String getApplicanExoerience() {
        return applicanExoerience;
    }

    public void setApplicanExoerience(String applicanExoerience) {
        this.applicanExoerience = applicanExoerience;
    }

    public Users(BigInteger id, String userName, String password, String sex, Date birthday, String createTime, String isadmin, String conText, Integer applicantId, String applicanName, String applicanSex, String applicanAge, String applicanJob, String applicanspeciaty, String applicanExoerience) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.createTime = createTime;
        this.isadmin = isadmin;
        this.conText = conText;
        this.applicantId = applicantId;
        this.applicanName = applicanName;
        this.applicanSex = applicanSex;
        this.applicanAge = applicanAge;
        this.applicanJob = applicanJob;
        this.applicanspeciaty = applicanspeciaty;
        this.applicanExoerience = applicanExoerience;
    }
}
