package com.lizhi.movieweb.Controller;

import com.lizhi.movieweb.Dao.UserDao;
import com.lizhi.movieweb.Entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@CrossOrigin
public class Controller {
    @Autowired
    private UserDao userDao;
    @RequestMapping("signIn")
    @CrossOrigin(origins = "http://localhost:8000")
    public boolean signIn(@RequestBody Map<String, Object> param){
        System.out.println("helloworld");
        String userId=param.get("userId").toString();
        String userPwd=param.get("userPwd").toString();
        System.out.println(userId+" "+userPwd);
        if(userDao.hasUser(userId)){
            User user=userDao.getUser(userId);
            if(user.getUserPwd().equals(userPwd))
                return true;
            return false;
        }else{
            return false;
        }
    }
    @RequestMapping("movieList")
    @CrossOrigin(origins = "http://localhost:8000")
    public List<String> movieList(){
        System.out.println("trying to get movies");
        List<String> list=new ArrayList<String>();
        for(int i=0;i!=100;++i){
            list.add("https://media.w3.org/2010/05/sintel/trailer_hd.mp4");
        }
        return list;
    }
}
