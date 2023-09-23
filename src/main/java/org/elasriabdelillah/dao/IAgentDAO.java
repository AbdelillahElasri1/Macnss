package org.elasriabdelillah.dao;

import org.elasriabdelillah.entity.Agent;

public interface IAgentDAO extends DAO<Agent>{
    final String id = "id";
    final String name = "name";
    final String email = "email";
    final String password = "password";
    final String verificationCode = "verificationCode";
}
