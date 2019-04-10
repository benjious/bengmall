package com.vb.seckillserver.web.bean;

public class GoodBean {
    private String name;
    private String imgUrl;
    private String brand;
    private String store;
    private int status;
    private String category;
    private Double price;

    public GoodBean(String name, String imgUrl, String brand, String store, int status, String category, Double price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.brand = brand;
        this.store = store;
        this.status = status;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodBean{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", store='" + store + '\'' +
                ", status=" + status +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
