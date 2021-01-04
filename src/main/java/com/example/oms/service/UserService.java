package com.example.oms.service;

import com.example.oms.entity.User;
import com.example.oms.model.UserRegistrationDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService extends UserDetailsService {

    User save(UserRegistrationDTO registration);

    User findByEmail(String email);
}
