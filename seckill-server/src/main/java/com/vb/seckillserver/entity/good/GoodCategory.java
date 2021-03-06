package com.vb.seckillserver.entity.good;

import java.io.Serializable;

public class GoodCategory implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "GoodCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}