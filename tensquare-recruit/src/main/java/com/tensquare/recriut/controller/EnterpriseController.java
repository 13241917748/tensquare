package com.tensquare.recriut.controller;

import com.tensquare.recriut.pojo.Enterprise;
import com.tensquare.recriut.service.EnterpriseService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseController {


    @Autowired
    private EnterpriseService enterpriseService;

    /**
     * 查询热门企业
     * @return
     */
    @RequestMapping(value="/search/hotlist",method=RequestMethod.GET)
    public Result hotlist(){

        List<Enterprise> hotlist = enterpriseService.hotlist();
        return new Result(true, StatusCode.OK, "查询成功", hotlist);
    }

}
