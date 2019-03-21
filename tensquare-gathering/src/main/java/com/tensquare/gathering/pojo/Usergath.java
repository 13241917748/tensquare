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
@Table(name = "tb_usergath")
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getGathid() {
        return gathid;
    }

    public void setGathid(String gathid) {
        this.gathid = gathid;
    }

    public Date getExetime() {
        return exetime;
    }

    public void setExetime(Date exetime) {
        this.exetime = exetime;
    }
}
