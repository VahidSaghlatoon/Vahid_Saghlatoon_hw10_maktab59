package pharmacy.dao;

import pharmacy.entity.Drug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DrugDao {
    private final Config database = new Config();

    public Drug select(int id){
        try(Connection connection = database.getConnection()) {
            String selectQuery = "select * from drug where drug_id = ? ";
            PreparedStatement ps = connection.prepareStatement(selectQuery);
            ps.setInt(1,id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                Drug drug = new Drug();
                drug.setId(resultSet.getInt(1));
                drug.setName(resultSet.getString(2));
                drug.setPrice(resultSet.getDouble(3));
                drug.setInventory(resultSet.getInt(4));
                return drug ;
            }
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        DrugDao drugDao = new DrugDao();
        System.out.println(drugDao.select(3));
    }

}
