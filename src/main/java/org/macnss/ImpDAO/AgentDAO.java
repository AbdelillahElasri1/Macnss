package org.macnss.ImpDAO;

import org.macnss.dao.IAgentDAO;
import org.macnss.entity.Admin;
import org.macnss.entity.Agent;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AgentDAO implements IAgentDAO {

    @Override
    public Agent insert(Agent agent)  {
        String sql = "INSERT INTO agents(name, email, password)  VALUES(?, ?, ?) ";

        try( PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            preparedStatement.setString(1, agent.getName());
            preparedStatement.setString(2, agent.getEmail());
            preparedStatement.setString(3, agent.getPassword());

            if(preparedStatement.executeUpdate() > 0){
                System.out.println("Agent has been created successfully .");
                return agent;
            }else {
                System.out.println("Creation of Agent has been Failed");

                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Agent get(String agentId) {
        Agent agent = new Agent();
        String sql = "SELECT * FROM `agents` WHERE id = ?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, agentId);
            ResultSet res = preparedStatement.executeQuery();

            if(res.wasNull()){
                return  null;
            }

            while (res.next()){
                agent.setId(res.getString(id));
                agent.setName(res.getString(name));
                agent.setEmail(res.getString(email));
                agent.setPassword(res.getString(password));
                agent.setVerificationCode(res.getString(verificationCode));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return agent;
    }

    @Override
    public List<Agent> getAll() {
        return null;
    }

    @Override
    public Agent update(Agent agent) {
        String sql = "UPDATE agents SET name = ?, email = ?, password = ? WHERE id = ?";

        try( PreparedStatement preparedStatement = connection.prepareStatement(sql);){
            preparedStatement.setString(1, agent.getName());
            preparedStatement.setString(2, agent.getEmail());
            preparedStatement.setString(3, agent.getPassword());
            preparedStatement.setString(4, agent.getId());

            if(preparedStatement.executeUpdate() > 0){
                System.out.println("Agent has been updated successfully .");
                return agent;
            }else {
                System.out.println("Update of Agent has been Failed");

                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Agent agent) {

    }

}
