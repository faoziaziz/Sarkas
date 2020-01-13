package com.labseni.Sarkas.service;

import com.labseni.Sarkas.model.User;

/**
 * Created by OmiD.HaghighatgoO on 8/21/2019.
 */

public interface AuthorizationService {


    public Boolean saveUser(User user);

    public User findByName(String name);


}
