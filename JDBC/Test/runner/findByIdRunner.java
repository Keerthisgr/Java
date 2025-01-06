package com.xworkz.broke.runner;

import com.xworkz.broke.service.EcommerceService;
import com.xworkz.broke.service.EcommerceServiceImpl;
import com.xworkz.broke.dao.EcommerceDao;
import com.xworkz.broke.dao.EcommerceDaoImpl;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class findByIdRunner {
    private static EcommerceDao ecommerceService = new EcommerceDaoImpl();

    public static void main(String[] args) {
        ResultSet resultSet = ecommerceService.findById(6);
        boolean isEmpty = true;
        try{
            while (resultSet.next()){
                isEmpty = false;
                int id = resultSet.getInt(1);
                String productName = resultSet.getString(2);
                String productBrand = resultSet.getString(3);
                String productModel = resultSet.getString(4);
                Date mfgDate = resultSet.getDate(5);
                Double price = resultSet.getDouble(6);
                String currency = resultSet.getString(7);
                System.out.println("Id: "+ id + " productName: " + productName + " productBrand: " + productBrand + " productModel: "+ productModel
                        + " mfgDate: " + mfgDate + " price: " + price + " currency: " + currency );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (isEmpty) System.out.println("No data found");
  }


    }
}





