package com.preetidev.lookie;

public class Cart_Data {
    private String Name,rating ,price;
    private int img;

    public Cart_Data(String name, String rating, String price, int img) {
        Name = name;
        this.rating = rating;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
