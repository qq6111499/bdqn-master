package com.bdqn.rlzyglxt.dao.impl;

import com.bdqn.rlzyglxt.dao.UserDao;
import com.bdqn.rlzyglxt.pojo.Users;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public Users findUser(String userName, String passWord) {
        Query query = new Query();
        Criteria criteria = Criteria.where("userName").is(userName).and("passWord").is(passWord);
        query.addCriteria(criteria);
        Users Users = mongoTemplate.findOne(query, Users.class);
        return Users;
    }

    @Override
    public List<Users> selectUsersAll() {
        return mongoTemplate.findAll(Users.class);
    }

    @Override
    public void insertUsers(Users users) {
        mongoTemplate.save(users);
    }


}
