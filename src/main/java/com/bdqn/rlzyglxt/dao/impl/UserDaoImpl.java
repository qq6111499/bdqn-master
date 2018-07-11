package com.bdqn.rlzyglxt.dao.impl;

import com.bdqn.rlzyglxt.dao.UserDao;
import com.bdqn.rlzyglxt.pojo.Student;
import com.bdqn.rlzyglxt.pojo.dbrl;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.util.List;

@Repository("studentDao")
public class UserDaoImpl implements UserDao {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public dbrl findUser(String userName, String passWord) {

        Query query = new Query();
        Criteria criteria = Criteria.where("userName").is(userName).and("passWord").is(passWord);
        query.addCriteria(criteria);
        dbrl dbrl = mongoTemplate.findOne(query, com.bdqn.rlzyglxt.pojo.dbrl.class);

        return dbrl;
    }


}
