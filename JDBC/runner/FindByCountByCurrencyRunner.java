package com.xworkz.broke.runner;

import com.xworkz.broke.dao.EcommerceDao;
import com.xworkz.broke.dao.EcommerceDaoImpl;
import com.xworkz.broke.service.EcommerceService;
import com.xworkz.broke.service.EcommerceServiceImpl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindByCountByCurrencyRunner {
    private static EcommerceDao ecommerceService = new EcommerceDaoImpl();

    public static void main(String[] args) {
        ResultSet resultSet = ecommerceService.countByCurrency("99");
        boolean isEmpty = true;
        try{
            while (resultSet.next()){
                isEmpty = false;

                String currency = resultSet.getString(1);
                System.out.println( " currency: " + currency );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (isEmpty) System.out.println("No data found");
        }
    }
}
