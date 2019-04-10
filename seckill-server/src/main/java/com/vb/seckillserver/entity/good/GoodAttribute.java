package com.vb.seckillserver.entity.good;

import java.io.Serializable;
import java.util.List;

public class GoodAttribute implements Serializable {
    private Integer id;

    private Integer categoryId;

    private String name;

    private Integer sort;

    private static final long serialVersionUID = 1L;

    private List<GoodAttributeOption> mOptions;

    public List<GoodAttributeOption> getOptions() {
        return mOptions;
    }

    public void setOptions(List<GoodAttributeOption> options) {
        mOptions = options;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}