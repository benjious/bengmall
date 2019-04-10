package com.vb.seckillserver.entity.good;

import java.io.Serializable;
import java.util.List;

public class GoodAttributeOption implements Serializable {
    private Integer id;

    private String name;

    private Integer attrId;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}