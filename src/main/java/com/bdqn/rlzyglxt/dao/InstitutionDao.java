package com.bdqn.rlzyglxt.dao;

import com.bdqn.rlzyglxt.pojo.Institution;

import java.util.List;

public interface InstitutionDao {
    List<Institution> selectInstitutionAll();

    void insertInstitution(Institution institution);
}
