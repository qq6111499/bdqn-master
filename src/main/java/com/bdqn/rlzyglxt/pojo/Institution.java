package com.bdqn.rlzyglxt.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
@Document(collection = "institution")
public class Institution implements Serializable {
    /*
    *
    * 奖惩编号
    * */
    private Integer id;
/*
* 奖惩名称
* */
    private String name;

    /*
    *
    * 奖惩原因
    * */
    private  String reason;
    /*
    * 奖惩说明
    * */
    private String explain;
    /*
    * 创建时间
    * */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
