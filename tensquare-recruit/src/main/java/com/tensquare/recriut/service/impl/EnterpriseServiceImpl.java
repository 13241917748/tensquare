package com.tensquare.recriut.service.impl;

import com.tensquare.recriut.dao.EnterpriseDao;
import com.tensquare.recriut.pojo.Enterprise;
import com.tensquare.recriut.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseDao enterpriseDao;

    /**
     * 热门企业列表
     * @return
     */
    public List<Enterprise> hotlist(){
        return enterpriseDao.findByIshot("1");
    }

}
