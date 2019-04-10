package com.vb.seckillserver.dto;

public class SeckillResult<T> {
    private  long seckillId;
    private T data;
    private boolean isSuccessed;
    private String error;

    public SeckillResult(boolean success, T data) {
        this.isSuccessed = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String error) {
        this.isSuccessed = success;
        this.error = error;
    }

    @Override
    public String toString() {
        return "SeckillResult{" +
                "seckillId=" + seckillId +
                ", data=" + data +
                ", isSuccessed=" + isSuccessed +
                ", error='" + error + '\'' +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccessed() {
        return isSuccessed;
    }

    public void setSuccessed(boolean successed) {
        isSuccessed = successed;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
