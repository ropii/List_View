package com.example.listview;

public class Cookie {

    private String name;
    private int taps;
    private int price;
    private int imageId;

    public Cookie(String name, int taps, int price, int imageId) {
        this.name = name;
        this.taps = taps;
        this.price = price;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaps() {
        return taps;
    }

    public void setTaps(int taps) {
        this.taps = taps;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


}
