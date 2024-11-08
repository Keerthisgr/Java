package com.xworkz.shopping;

import com.xworkz.shopping.details.Product;
import com.xworkz.shopping.product.Details;

public class ProductTester {
    public static void main(String[] args) {
        Product prod = new Product();
        Details details = new Details();
        prod.setProductId(120);
        prod.setProductName("T-shirt");
        prod.setProductType("Cloth");
        prod.setPrice(890.99);

        details.addProduct(prod);
        details.getDetails();

    }
}
