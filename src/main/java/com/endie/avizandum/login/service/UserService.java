package com.endie.avizandum.login.service;

import com.endie.avizandum.login.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}