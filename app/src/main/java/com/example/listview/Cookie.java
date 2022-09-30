package com.example.listview;

public class Cookie {

    private String name;
    private String price;
    private int imageId;

    public Cookie(String name, String price, int imageId) {
        this.name = name;
        this.price = price+" pts";
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


}
