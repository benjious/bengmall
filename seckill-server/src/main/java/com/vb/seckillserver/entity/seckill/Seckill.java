package com.vb.seckillserver.entity.seckill;

import java.io.Serializable;
import java.util.Date;

/**
 *  商品秒杀对象类，一种商品
 */


public class Seckill  implements Serializable{
    //秒杀商品id
    private long seckillId;
    //剩余数量
    private int number;
    private String name;
    private Date createTime;
    private Date endTime;
    private Date startTime;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", endTime=" + endTime +
                ", startTime=" + startTime +
                '}';
    }
}
