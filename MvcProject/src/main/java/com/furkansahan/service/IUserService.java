package com.furkansahan.service;


import com.furkansahan.model.User;
import com.furkansahan.model.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
