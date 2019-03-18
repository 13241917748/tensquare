package com.tensquare.recriut.dao;

import com.tensquare.recriut.pojo.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 *  企业数据访问接口
 *
 *  JpaRepository提供了基本的增删改查
 *  JpaSpecificationExecutor用于做复杂的条件查询
 */
public interface EnterpriseDao extends JpaRepository<Enterprise,String>, JpaSpecificationExecutor<Enterprise> {


    /**
     * 根据热门状态获取企业列表
     * @param ishot
     * @return
     */
    public List<Enterprise> findByIshot(String ishot);



}
