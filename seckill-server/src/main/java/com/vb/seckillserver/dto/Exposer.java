package com.vb.seckillserver.dto;

/**
 *  某一个秒杀的商品信息
 */
public class Exposer {
    private boolean exposer;
    private long secillId;
    private String md5;
    private long now;
    private long startTime;
    private long endTime;

    public Exposer(boolean exposer, long secillId, String md5, long now) {
        this.exposer = exposer;
        this.secillId = secillId;
        this.md5 = md5;
        this.now = now;
    }

    public Exposer(boolean exposer, long secillId) {
        this.exposer = exposer;
        this.secillId = secillId;
    }

    public Exposer(boolean exposer, long seckillId, long nowTime, long startTime, long endTime) {
        this.secillId = seckillId;
        this.startTime = startTime;
        this.endTime= endTime;
        this.now = nowTime;
        this.exposer = exposer;

    }

    public Exposer(boolean exposer, long seckillId, String md5) {
        this.exposer = exposer;
        this.secillId = seckillId;
        this.md5 = md5;
    }

    @Override
    public String toString() {
        return "Exposer{" +
                "exposer=" + exposer +
                ", secillId=" + secillId +
                ", md5='" + md5 + '\'' +
                ", now=" + now +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public boolean isExposer() {
        return exposer;
    }

    public void setExposer(boolean exposer) {
        this.exposer = exposer;
    }

    public long getSecillId() {
        return secillId;
    }

    public void setSecillId(long secillId) {
        this.secillId = secillId;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
}
