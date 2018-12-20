package dao;

import models.Product;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Queue;

public class DaoProduct {
    public static void addProduct (Product product){
     String query = " INSERT INTO mydb.products (POINT_ID, PRICE, " +
             "AMOUNT, NAME, DESCRIPTION)VALUES(?,?,?,?,?)";

        try {
            PreparedStatement ps = Connector.getConnection().prepareStatement(query);
            ps.setLong(1,product.getPointId());
            ps.setDouble(2,product.getPrice());
            ps.setDouble(3,product.getAmount());
            ps.setString(4,product.getName());
            ps.setString(5,product.getDescription());

            ps.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connector.closeConnection();
        }
    }

    public static ArrayList<Product> getProductsList(){
        ArrayList<Product> products = new ArrayList<>();
        try {
            Statement statement=Connector.getConnection().createStatement();
            ResultSet rs =statement.executeQuery("SELECT  * FROM mydb.products");
            while (rs.next()){
                products.add(new Product(rs.getLong("ID"),
                        rs.getLong("POINT_ID"),
                        rs.getDouble("PRICE"),
                        rs.getDouble("AMOUNT"),
                        rs.getString("NAME"),
                        rs.getString("DESCRIPTION")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connector.closeConnection();
        }

        return products;
    }


    }


