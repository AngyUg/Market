package dao;

import models.PointOfSale;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoPoint {

    public static void addPoint (PointOfSale point){
        String query = "INSERT INTO mydb.points (ADDRESS_ID,NAME)" +
                "VALUES (?,?)";
        try {
            PreparedStatement ps= Connector.getConnection().prepareStatement(query);
            ps.setLong(1,point.getAddressId());
            ps.setString(2,point.getName());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connector.closeConnection();
        }


    }

}
