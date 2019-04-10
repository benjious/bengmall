package com.vb.seckillserver.entity.good;

import java.io.Serializable;

public class GoodAttAdnOpn implements Serializable {
    private Integer id;

    private Integer skuId;

    private Integer optionId;

    private Integer attributeId;

    private Integer sort;

    private Integer supplierOptionId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSupplierOptionId() {
        return supplierOptionId;
    }

    public void setSupplierOptionId(Integer supplierOptionId) {
        this.supplierOptionId = supplierOptionId;
    }
}