package q2.com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import q2.com.example.demo.repository.UserRepository;
import q2.com.example.demo.entity.User;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	BCryptPasswordEncoder encoder = passwordEncoder();
        User user = repository.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), encoder.encode(user.getPassword()), new ArrayList<>());
    }
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
