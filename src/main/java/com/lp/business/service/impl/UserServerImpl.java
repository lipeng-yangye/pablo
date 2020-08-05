package com.lp.business.service.impl;

import com.lp.business.dao.UserDao;
import com.lp.business.model.entity.User;
import com.lp.business.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lipeng
 */
@Service
@Slf4j
public class UserServerImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User queryUser(String username) {
        User user = userDao.queryUser(username);
        log.info(user.toString());
        return user;
    }
}
