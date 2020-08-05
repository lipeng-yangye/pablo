package com.lp.business.dao;

import com.lp.business.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author lipeng
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * queryUser
     *
     * @param username
     * @return User
     */
    User queryUser(@Param("username") String username);
}

