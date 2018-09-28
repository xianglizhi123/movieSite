package com.lizhi.movieweb.Dao;

import com.lizhi.movieweb.Entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public interface UserDao {
    User getUser(String userId);
    boolean hasUser(String userId);
}
