package org.macnss.dao;

import org.macnss.entity.Agent;

public interface IAgentDAO extends DAO<Agent>{
    final String id = "id";
    final String name = "name";
    final String email = "email";
    final String password = "password";
    final String verificationCode = "verificationCode";
}
