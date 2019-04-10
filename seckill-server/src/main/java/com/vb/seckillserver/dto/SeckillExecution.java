package com.vb.seckillserver.dto;


import com.vb.seckillserver.entity.seckill.SuccessKilled;

public class SeckillExecution {

    private long seckillId;
    private String info;
    private int statue;
    private SuccessKilled mSuccessKilled;

    public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.info = statEnum.getInfo();
        this.statue  = statEnum.getState();
        this.mSuccessKilled = successKilled;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public SuccessKilled getSuccessKilled() {
        return mSuccessKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        mSuccessKilled = successKilled;
    }

    //秒杀成功调用的方法
    public SeckillExecution(long seckillId, String info, int statue, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.info = info;
        this.statue = statue;
        mSuccessKilled = successKilled;
    }

    //秒杀失败
    public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
        this.seckillId = seckillId;
        this.statue = statEnum.getState();
        this.info = statEnum.getInfo();
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", info='" + info + '\'' +
                ", statue=" + statue +
                ", mSuccessKilled=" + mSuccessKilled +
                '}';
    }
}
