package com.bdqn.rlzyglxt.contoller;

import com.bdqn.rlzyglxt.pojo.Institution;
import com.bdqn.rlzyglxt.service.InstitutionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/institution")
public class InstitutionController {

    @Resource
    private InstitutionService institutionService;

    @RequestMapping("/getIns.do")
    public List<Institution> selectInstitutionAll(){
        return institutionService.selectInstitutionAll();
    }

    @RequestMapping("/insertIn.do")
    public void insertIns(Institution institution){
        institutionService.insertInstitution(institution);
    }

}
