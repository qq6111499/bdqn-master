package com.bdqn.rlzyglxt.dao.impl;

import com.bdqn.rlzyglxt.dao.StipendDao;
import com.bdqn.rlzyglxt.pojo.Stipend;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("institutionDao")
public class StipendDaoImpl implements StipendDao{
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public List<Stipend> selectStipendAll() {
        return mongoTemplate.findAll(Stipend.class);
    }

    @Override
    public void insertStipend(Stipend stipend) {
        mongoTemplate.save(stipend);
    }
}
