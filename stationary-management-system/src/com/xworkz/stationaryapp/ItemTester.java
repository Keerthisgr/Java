package com.xworkz.stationaryapp;

import com.xworkz.stationaryapp.item.Item;
import com.xworkz.stationaryapp.product.Product;

public class ItemTester {
    public static void main(String[] args) {
        Product prod = new Product();
        Item item = new Item();
        item.setItemId(101);
        item.setItemName("Note Book");
        item.setItemBrand("Classmate");
        item.setPrice(809.90);

        prod.addItem(item);
        prod.getDetails();
    }
}
