package com.xworkz.stationaryapp.product;

import com.xworkz.stationaryapp.item.Item;

public class Product {
    Item item;
    public boolean addItem(Item item){
        boolean isItemAdded = false;
        if(item!=null){
            if(item.getItemId() > 0 && item.getItemName() != null){
                this.item = item;
                isItemAdded = true;
            }else{
                System.out.println("No empty space!!..");
            }
        }else{
            System.out.println("Already filled!!..");
        }
        return  isItemAdded;
    }
    public void getDetails()
    {
        System.out.println("Item id: "+item.getItemId());
        System.out.println("Item name "+item.getItemName());
        System.out.println("Item brand: "+item.getItemBrand());
        System.out.println("Item price "+item.getPrice());
    }
}
