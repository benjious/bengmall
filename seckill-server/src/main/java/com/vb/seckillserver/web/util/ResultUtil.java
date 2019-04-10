package com.vb.seckillserver.web.util;


import com.vb.seckillserver.web.bean.Result;

public class ResultUtil<T> {
    private Result<T> result;

    public Result<T> getResult() {
        return result;
    }

    public void setResult(Result<T> result) {
        this.result = result;
    }

    public ResultUtil() {
        result = new Result<>();
        result.setCode(200);
        result.setSuccess(true);
        result.setMessage("success");
    }

    public Result<T> setResult(T t) {
        result.setResult(t);
        result.setCode(200);
        return this.result;
    }

    public Result<T> setResult(T t,String msg) {
        result.setResult(t);
        result.setMessage(msg);
        result.setCode(200);
        return result;
    }

    public Result<T> setMessage(String msg) {
        result.setSuccess(false);
        result.setMessage(msg);
        result.setCode(500);
        return result;
    }

    public Result<T> setErrMsg(Integer code,String msg) {
        result.setCode(code);
        result.setMessage(msg);
        result.setSuccess(false);
        return result;
    }
}
