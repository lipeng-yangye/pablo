package com.lp.business.model.entity;

import lombok.Data;

import java.util.Set;

/**
 * @author Admin
 */
@Data
public class User {
    private int userId;
    private String username;
    private String password;
    private Set<Role> roles;
}
