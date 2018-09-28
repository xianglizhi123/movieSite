package com.lizhi.movieweb.Impl;

import com.lizhi.movieweb.Dao.UserDao;
import com.lizhi.movieweb.Entity.User;
import com.lizhi.movieweb.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;
     public User getUser(String userId){
         User user=new User();
         user=userMapper.getUser(userId);
         return user;
    }
    public boolean hasUser(String userId){
         int count=userMapper.hasUser(userId);
         if(count>0)
             return true;
         return false;
    }
}
