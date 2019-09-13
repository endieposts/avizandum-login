package com.endie.avizandum.login.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}