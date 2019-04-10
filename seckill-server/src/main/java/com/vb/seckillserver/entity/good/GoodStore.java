package com.vb.seckillserver.entity.good;

import java.io.Serializable;

public class GoodStore implements Serializable {
    private Integer id;

    private String name;

    private String storePhone;

    private String imgUrl;

    private Integer chargePersonId;

    private String sellTags;

    private String storeAddrCity;

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

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getChargePersonId() {
        return chargePersonId;
    }

    public void setChargePersonId(Integer chargePersonId) {
        this.chargePersonId = chargePersonId;
    }

    public String getSellTags() {
        return sellTags;
    }

    public void setSellTags(String sellTags) {
        this.sellTags = sellTags == null ? null : sellTags.trim();
    }

    public String getStoreAddrCity() {
        return storeAddrCity;
    }

    public void setStoreAddrCity(String storeAddrCity) {
        this.storeAddrCity = storeAddrCity == null ? null : storeAddrCity.trim();
    }
}