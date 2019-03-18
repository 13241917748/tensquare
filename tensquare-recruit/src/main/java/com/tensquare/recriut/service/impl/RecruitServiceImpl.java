package com.tensquare.recriut.service.impl;

import com.tensquare.recriut.dao.RecruitDao;
import com.tensquare.recriut.pojo.Recruit;
import com.tensquare.recriut.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {


    @Autowired
    private RecruitDao recruitDao;

    /**
     * 根据状态查询
     * @param state
     * @return
     */
    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state){
        return recruitDao.findTop4ByStateOrderByCreatetimeDesc(state);
    }

    /**
     * 最新职位列表
     * @return
     */
    public List<Recruit> newlist(){
        return recruitDao.findTop12ByStateNotOrderByCreatetimeDesc("0");
    }

}
