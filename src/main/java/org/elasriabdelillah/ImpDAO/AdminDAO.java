package org.elasriabdelillah.ImpDAO;

import org.elasriabdelillah.Database.Database;

import org.elasriabdelillah.entity.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AdminDAO {
    private Connection connection = Database.getConnection();

    public Admin login(String email, String password) throws SQLException {
        Admin admin = null;
        String sql = "SELECT * FROM `admin` WHERE email = ? AND password = ? ";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet res = preparedStatement.executeQuery();
            while (res.next()){
                admin = Admin.getInstance(
                        res.getString("id"), res.getString("fullName"),
                        res.getString("email"), res.getString("password") );
            }
        }catch (SQLException e ){
            throw new SQLException();
        }

        return  admin;
    }

}
