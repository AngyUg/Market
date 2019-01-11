package dao;


import models.Address;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoAddress {

    public static void addAddress(Address address) {
        String quer = "INSERT INTO mydb.addresses" +
                " (COUNTRY, REGION,CITY, DISTRICT," +
                " STREET, HOUSE_NUMB,INDEX_) VALUES" +
                "(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = Connector.getConnection().prepareStatement(quer);
            ps.setString(1, address.getCountry());
            ps.setString(2, address.getRegion());
            ps.setString(3, address.getCity());
            ps.setString(4, address.getDistrict());
            ps.setString(5, address.getStreet());
            ps.setString(6, address.getHouseNumb());
            ps.setString(7, address.getIndex());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }


    }

    public static Address getAddressById(long addressId) {
        Address address = new Address();
        String query = "SELECT * FROM mydb.addresses WHERE ID=" + addressId;
        try {
            Statement statement = Connector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                address.setId(rs.getLong("ID"));
                address.setCountry(rs.getString("COUNTRY"));
                address.setRegion(rs.getString("REGION"));
                address.setCity(rs.getString("CITY"));
                address.setDistrict(rs.getString("DISTRICT"));
                address.setStreet(rs.getString("STREET"));
                address.setHouseNumb(rs.getString("HOUSE_NUMB"));
                address.setIndex(rs.getString("INDEX"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Connector.closeConnection();
        }
        return address;
    }
}
