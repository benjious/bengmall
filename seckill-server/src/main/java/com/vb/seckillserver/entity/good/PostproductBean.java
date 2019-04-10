package com.vb.seckillserver.entity.good;

public class PostproductBean {
    private String barcode;
    private int brandId;
    private int categoryId;
    private int integral;
    private String intro;
    private boolean isIntegral;
    private boolean isPackage;
    private double marketPrice;
    private String marque;
    private int merId;
    private String name;
    private String pictureUrl;
    private double price;
    private int stock;
    private int typeId;
    private int virtualBuyNum;
    private int warnStock;

    private int state;
    private int status;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }


    public void setState(byte state) {
        this.state = state;
    }


    public void setStatus(byte status) {
        this.status = status;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public boolean isIntegral() {
        return isIntegral;
    }

    public void setIntegral(boolean integral) {
        isIntegral = integral;
    }

    public boolean isPackage() {
        return isPackage;
    }

    public void setPackage(boolean aPackage) {
        isPackage = aPackage;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getMerId() {
        return merId;
    }

    public void setMerId(int merId) {
        this.merId = merId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getVirtualBuyNum() {
        return virtualBuyNum;
    }

    public void setVirtualBuyNum(int virtualBuyNum) {
        this.virtualBuyNum = virtualBuyNum;
    }

    public int getWarnStock() {
        return warnStock;
    }

    public void setWarnStock(int warnStock) {
        this.warnStock = warnStock;
    }
}
