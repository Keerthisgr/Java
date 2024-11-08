package com.xworkz.shopping.product;

import com.xworkz.shopping.details.Product;

public class Details {
    Product product;
    public boolean addProduct(Product product)
    {
        boolean isProductAdded = false;
        if(product != null){
            if(product.getProductId() > 0 && product.getProductName() != null){
            this.product = product;
            isProductAdded = true;
            }
            else{
                System.out.println("No empty space");
            }
        }else{
            System.out.println("Already filled!!..");
        }
        return isProductAdded;
    }
    public void getDetails()
    {
        System.out.println("Product Id: "+product.getProductId());
        System.out.println("Product Name: "+product.getProductName());
        System.out.println("Product Type: "+product.getProductType());
        System.out.println("Product price: "+product.getPrice());
    }
}
