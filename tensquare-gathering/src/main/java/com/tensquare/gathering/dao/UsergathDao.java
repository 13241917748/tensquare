package com.tensquare.gathering.dao;

import com.tensquare.gathering.pojo.Gathering;
import com.tensquare.gathering.pojo.Usergath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Usergath数据访问接口
 * @author Administrator
 *
 */
public interface UsergathDao extends JpaRepository<Usergath,String>,JpaSpecificationExecutor<Usergath>{
	
}
