package dao;

import models.PointOfSale;
import utils.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPointOfSale {

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

    public static PointOfSale getPointById(long pointId){
        PointOfSale point = new PointOfSale();
        String query= "SELECT * FROM mydb.points WHERE ID ="+ pointId;

        try {
            Statement statement=Connector.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                point.setId(rs.getLong("ID"));
                point.setAddressId(rs.getLong("ADDRESS_ID"));
                point.setName(rs.getNString("NAME"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Connector.closeConnection();
        }

        return point;
    }

}
