package com.tensquare.gathering.pojo;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * usergath实体类
 *
 * @author Administrator
 */
@Entity
@Table(name = "tb_gathering")
public class Usergath {

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 活动ID
     */
    private String gathid;

    /**
     * 点击时间
     */
    private Date exetime;


}
