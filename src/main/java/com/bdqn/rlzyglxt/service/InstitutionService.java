package com.bdqn.rlzyglxt.service;

import com.bdqn.rlzyglxt.pojo.Institution;

import java.util.List;

public interface InstitutionService {
    List<Institution> selectInstitutionAll();

    void insertInstitution(Institution institution);
}
