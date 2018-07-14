package com.bdqn.rlzyglxt.service.impl;

import com.bdqn.rlzyglxt.dao.InstitutionDao;
import com.bdqn.rlzyglxt.pojo.Institution;
import com.bdqn.rlzyglxt.service.InstitutionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("institutionService")
public class InstitutionServicempl implements InstitutionService {

    @Resource
    private InstitutionDao institutionDao;
    @Override
    public List<Institution> selectInstitutionAll() {
        return institutionDao.selectInstitutionAll();
    }

    @Override
    public void insertInstitution(Institution institution) {
        institutionDao.insertInstitution(institution);
    }
}
