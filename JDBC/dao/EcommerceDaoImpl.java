package com.xworkz.broke.dao;

import java.sql.*;
import java.time.LocalDate;

public class EcommerceDaoImpl implements EcommerceDao {
    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    private final String USER = "root";
    private final String PASS = "Keerthi8088169847";




    @Override
    public Integer validateAndSave(String productName, String productBrand, String productModel, LocalDate mfgDate, Double price, String currency) {

        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
//            connection.setAutoCommit(false);
            PreparedStatement prepareStatement = connection.prepareStatement("insert into ecommerce_details values (?,?,?,?,?,?,?)");
            prepareStatement.setInt(1, 0);
            prepareStatement.setString(2, productName);
            prepareStatement.setString(3, productBrand);
            prepareStatement.setString(4, productModel);
            prepareStatement.setDate(5, Date.valueOf(mfgDate));
            prepareStatement.setString(6,Double.valueOf(price).toString());
            prepareStatement.setString(7, currency);
//            connection.commit();
            return prepareStatement.executeUpdate();

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                System.out.println(e.getMessage());

            }
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public ResultSet findById(int id) {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("select * from ecommerce_details where id=?");
            statement.setInt(1,id);
            return statement.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public ResultSet findByIdModel(int id, String productModel) {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("select * from ecommerce_details where id = ? and product_model = ?");
            statement.setInt(1, id);
            statement.setString(2, productModel);
            return statement.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public ResultSet countByCurrency(String currency) {

        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("select count(currency) from ecommerce_details where currency = ?");
            statement.setString(1, currency);
            return statement.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public ResultSet productNameAndBrand(String productName, String productBrand) {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("select * from ecommerce_details where product_name = ? and product_brand = ?");
            statement.setString(1, productName);
            statement.setString(2, productBrand);
            return statement.executeQuery();
        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }
        return null;
    }

    @Override
    public Integer updatePriceById(int id, double price) {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("update ecommerce_details set price=? where id=?");
            statement.setDouble(1, price);
            statement.setInt(2, id);
            return statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Integer updateBrandByid(int id, String brand) {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("update ecommerce_details set product_brand=? where id=?");
            statement.setString(1, brand);
            statement.setInt(2, id);
            int row = statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public Integer deleteById(int id) {
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement statement = connection.prepareStatement("delete from ecommerce_details where id=?");
            statement.setInt(1, id);
            return statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

}
