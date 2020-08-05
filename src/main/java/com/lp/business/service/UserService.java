package com.lp.business.service;

import com.lp.business.model.entity.User;

/**
 * @author lipeng
 */
public interface UserService {
    /**
     * queryUser
     *
     * @param username
     * @return User
     */
    User queryUser(String username);
}
