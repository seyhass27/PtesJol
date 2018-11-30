package com.example.andriod.ptesjol.Model;

public class House {
    private String houseName;
    private double rentPrice;
    private String imgUrl;
    private double houselat;
    private double houselong;

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double housePrice) {
        this.rentPrice = housePrice;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getHouselat() {
        return houselat;
    }

    public void setHouselat(double houselat) {
        this.houselat = houselat;
    }

    public double getHouselong() {
        return houselong;
    }

    public void setHouselong(double houselong) {
        this.houselong = houselong;
    }
}
