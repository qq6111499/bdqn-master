package com.bdqn.rlzyglxt.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "serializable")
public class Stipend implements Serializable {
    /*
    * 薪金信息编号
    * */
    private  Integer id;
    /*
    * 员工姓名
    * */
    private String name;
    /*
    * 基本薪金
    * */
    private Double basic;
    /*
    * 饭补
    * */
    private Double eat;
    /*
    * 房补
    * */
    private  Double house;
    /*
    * 工资发放时间
    * */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date granttime;
    /*
    * 全勤奖
    * */
    private Double duty;
    /*
    * 赋税
    * */
    private Double scot;
    /*
    * 罚款
    *
    * */
    private Double punishment;

    /*
    * 额外补助
    * */
    private  Double other;
    /*
    * 总计
    * */
    private  Double totalize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getEat() {
        return eat;
    }

    public void setEat(Double eat) {
        this.eat = eat;
    }

    public Double getHouse() {
        return house;
    }

    public void setHouse(Double house) {
        this.house = house;
    }

    public Date getGranttime() {
        return granttime;
    }

    public void setGranttime(Date granttime) {
        this.granttime = granttime;
    }

    public Double getDuty() {
        return duty;
    }

    public void setDuty(Double duty) {
        this.duty = duty;
    }

    public Double getScot() {
        return scot;
    }

    public void setScot(Double scot) {
        this.scot = scot;
    }

    public Double getPunishment() {
        return punishment;
    }

    public void setPunishment(Double punishment) {
        this.punishment = punishment;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public Double getTotalize() {
        return totalize;
    }

    public void setTotalize(Double totalize) {
        this.totalize = totalize;
    }
}
