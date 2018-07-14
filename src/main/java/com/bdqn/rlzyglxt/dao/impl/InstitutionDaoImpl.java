package com.bdqn.rlzyglxt.dao.impl;

import com.bdqn.rlzyglxt.dao.InstitutionDao;
import com.bdqn.rlzyglxt.pojo.Institution;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("institutionDao")
public class InstitutionDaoImpl implements InstitutionDao {

    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public List<Institution> selectInstitutionAll() {
        return mongoTemplate.findAll(Institution.class);
    }

    @Override
    public void insertInstitution(Institution institution) {
        mongoTemplate.save(institution);
    }
}
