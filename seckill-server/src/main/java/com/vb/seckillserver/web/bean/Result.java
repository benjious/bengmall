package com.vb.seckillserver.web.bean;

public class Result<T> {
    private boolean success;
    private String message;
    private  Integer code;
    private  long timestap = System.currentTimeMillis();

    private T result;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setTimestap(long timestap) {
        this.timestap = timestap;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    public long getTimestap() {
        return timestap;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
