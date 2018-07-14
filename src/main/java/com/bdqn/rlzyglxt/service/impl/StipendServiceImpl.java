package com.bdqn.rlzyglxt.service.impl;

import com.bdqn.rlzyglxt.dao.StipendDao;
import com.bdqn.rlzyglxt.pojo.Stipend;
import com.bdqn.rlzyglxt.service.StipendService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("stipendService")
public class StipendServiceImpl implements StipendService{
    @Resource
    private StipendDao stipendDao;
    @Override
    public List<Stipend> selectStipendAll() {
        return stipendDao.selectStipendAll();
    }

    @Override
    public void insertStipend(Stipend stipend) {
        stipendDao.insertStipend(stipend);
    }
}
