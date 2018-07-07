package com.bdqn.rlzyglxt.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class textContoller {

    @RequestMapping("index")
    public String getIndex() {
        return "index.html";
    }
}
