package com.labseni.Sarkas.service;

import com.labseni.Sarkas.model.UserDao;
import com.labseni.Sarkas.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by OmiD.HaghighatgoO on 8/21/2019.
 */

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    UserDao userDao;


    public Boolean saveUser(User user){
        return userDao.saveUser(user) ;
    }

    @Override
    public User findByName(String name) {

        return userDao.findByName(name);
    }
}
