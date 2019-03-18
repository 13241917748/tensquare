package com.tensquare.recriut.controller;

import com.tensquare.recriut.pojo.Recruit;
import com.tensquare.recriut.service.RecruitService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecruitController {

    @Autowired
    private RecruitService recruitService;



    /**
     * 查询最新职位列表(按创建日期降序排序)
     * 查询状态为2并以创建日期降序排序，查询前4条记录
     * @return
     */
    @RequestMapping(value="/search/recommend",method= RequestMethod.GET)
    public Result recommend(){
        List<Recruit> list = recruitService.findTop4ByStateOrderByCreatetimeDesc("2");
        return new Result(true,StatusCode.OK,"查询成功",list);
    }

    /**
     * 最新职位列表
     * 查询状态不为0并以创建日期降序排序，查询前12条记录
     * @return
     */
    @RequestMapping(value="/search/newlist",method= RequestMethod.GET)
    public Result newlist(){
        return new Result(true,StatusCode.OK,"查询成功",recruitService.newlist());
    }

}
