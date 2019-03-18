package com.tensquare.recriut.service;

import com.tensquare.recriut.pojo.Recruit;

import java.util.List;

public interface RecruitService {


    /**
     * 根据状态查询
     * @param state
     * @return
     */
    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state);

    /**
     * 最新职位列表
     * @return
     */
    public List<Recruit> newlist();

}
