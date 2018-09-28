package com.lizhi.movieweb.Mapper;

import com.lizhi.movieweb.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    @Select("Select userId,userPwd from users where userId=#{userId}")
    User getUser(String userId);
    @Select("select count(*) from users where userId=#{userId}")
    int hasUser(String userId);
}
