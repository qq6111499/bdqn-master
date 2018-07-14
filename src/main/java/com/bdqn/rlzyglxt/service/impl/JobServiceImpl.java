package com.bdqn.rlzyglxt.service.impl;

import com.bdqn.rlzyglxt.dao.JobDao;
import com.bdqn.rlzyglxt.pojo.Job;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("jobService")
public class JobServiceImpl implements JobDao {

    @Resource
    private JobDao jobDao;
    @Override
    public List<Job> selectJobAll() {
        return jobDao.selectJobAll();
    }

    @Override
    public void insertJob(Job job) {
        jobDao.insertJob(job);
    }
}
