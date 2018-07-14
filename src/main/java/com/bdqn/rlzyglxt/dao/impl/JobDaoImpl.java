package com.bdqn.rlzyglxt.dao.impl;

import com.bdqn.rlzyglxt.dao.JobDao;
import com.bdqn.rlzyglxt.pojo.Job;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("jobDao")
public class JobDaoImpl implements JobDao {
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public List<Job> selectJobAll() {
        return mongoTemplate.findAll(Job.class);
    }

    @Override
    public void insertJob(Job job) {
        mongoTemplate.insert(job);
    }
}
