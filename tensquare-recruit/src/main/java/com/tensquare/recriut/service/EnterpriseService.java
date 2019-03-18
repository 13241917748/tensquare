package com.tensquare.recriut.service;

import com.tensquare.recriut.pojo.Enterprise;

import java.util.List;

public interface EnterpriseService {

    /**
     * 热门企业列表
     * @return
     */
    public List<Enterprise> hotlist();

}
