package com.vb.seckillserver.entity.seckill;

import java.util.Date;

/**
 * 成功秒杀某个商品的对象，对应某个用户
 */
public class SuccessKilled {
    private long seckillId;
    private long userPhone;
    private Date creatTime;
    private short statue;

    private Seckill mSeckill;

    public Seckill getSeckill() {
        return mSeckill;
    }

    public void setSeckill(Seckill seckill) {
        mSeckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", creatTime=" + creatTime +
                ", statue=" + statue +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public short getStatue() {
        return statue;
    }

    public void setStatue(short statue) {
        this.statue = statue;
    }
}
