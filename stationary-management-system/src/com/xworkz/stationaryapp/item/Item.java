package com.xworkz.stationaryapp.item;

public class Item {
    private int itemId;
    private String itemName;
    private String itemBrand;
    private double price;

    public Item() {
        System.out.println("Default constructor is invoked!!...");
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
