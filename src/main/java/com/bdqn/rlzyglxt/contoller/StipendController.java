package com.bdqn.rlzyglxt.contoller;

import com.bdqn.rlzyglxt.pojo.Stipend;
import com.bdqn.rlzyglxt.service.StipendService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/stipend")
public class StipendController{

    @Resource
    private StipendService stipendService;

    @RequestMapping("/getStiAll.do")
    public List<Stipend> selectStiAll(){

        return  stipendService.selectStipendAll();
    }

    @RequestMapping("/insSti.do")
    public  void insertSti(Stipend stipend){
        stipendService.insertStipend(stipend);
    }
}
