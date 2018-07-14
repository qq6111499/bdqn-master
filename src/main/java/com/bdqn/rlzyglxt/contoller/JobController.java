package com.bdqn.rlzyglxt.contoller;

import com.bdqn.rlzyglxt.pojo.Job;
import com.bdqn.rlzyglxt.service.JobService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    @Resource
    private JobService jobService;

    @RequestMapping("/selJobAll.do")
    public List<Job> selectJobAll(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");//解决跨域请求
        return  jobService.selectJobAll();
    }

    @RequestMapping("/insertJob.do")
    public void insertJob(HttpServletResponse response,Job job){
        response.setHeader("Access-Control-Allow-Origin", "*");//解决跨域请求
          jobService.insertJob(job);
    }
}
