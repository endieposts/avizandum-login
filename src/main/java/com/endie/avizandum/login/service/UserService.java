package com.endie.avizandum.login.service;

import com.endie.avizandum.login.model.User;
import com.endie.avizandum.login.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}