package org.elasriabdelillah.Dao.impl;

import org.elasriabdelillah.Dao.Dao;
import org.elasriabdelillah.Database.DatabaseConnectionManager;
import org.elasriabdelillah.Enum.FolderStatus;
import org.elasriabdelillah.entity.Folder;

import java.lang.runtime.TemplateRuntime;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FolderDao implements Dao<Folder> {
    Connection connection = DatabaseConnectionManager.getConnection();

    @Override
    public Folder save(Folder folder) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Folder (folder_id,folder_name,depositDate,folderStatus) VALUES(?,?,?)");
            preparedStatement.setInt(1,folder.getId());
            preparedStatement.setString(2,folder.getName());
            preparedStatement.setDate(3, (Date) folder.getDepositDate());
            preparedStatement.setString(4, String.valueOf(folder.getFolderStatus()));
            int row = preparedStatement.executeUpdate();
            if(row > 0){
                return folder;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Folder update(Folder folder) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Folder SET folderStatus = ? where folder_id = ?");
            preparedStatement.setString(1, String.valueOf(folder.getFolderStatus()));
            preparedStatement.setInt(2,folder.getId());
            int row = preparedStatement.executeUpdate();
            if (row > 0){
                return folder;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Folder> getAll() {
        List<Folder> folders = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Folder");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int folder_id = resultSet.getInt("folder_id");
                String folder_name = resultSet.getString("folder_name");
                Date depositDate = resultSet.getDate("depositDate");
                FolderStatus folder_status = FolderStatus.valueOf(resultSet.getString("folderStatus"));
                Folder folder = new Folder(folder_id,folder_name,depositDate,folder_status);
                folders.add(folder);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return folders;
    }

    @Override
    public Folder getOne(int id) {
        Folder folder = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Folder where folder_id = ?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int folder_id = resultSet.getInt("folder_id");
                String folder_name = resultSet.getString("folder_name");
                Date depositDate = resultSet.getDate("depositDate");
                FolderStatus folder_status  = FolderStatus.valueOf(resultSet.getString("folderStatus"));
                folder = new Folder(folder_id,folder_name,depositDate,folder_status);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return folder;
    }
}
