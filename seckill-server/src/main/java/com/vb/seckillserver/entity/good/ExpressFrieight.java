package com.vb.seckillserver.entity.good;

import java.io.Serializable;

public class ExpressFrieight implements Serializable {
    private Integer id;

    private String expressGuid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpressGuid() {
        return expressGuid;
    }

    public void setExpressGuid(String expressGuid) {
        this.expressGuid = expressGuid == null ? null : expressGuid.trim();
    }
}