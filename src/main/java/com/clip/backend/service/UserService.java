package com.clip.backend.service;

import com.clip.backend.entity.User;
import com.clip.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String email, String password, String username){
        User user = new User(email, password, username);
        return userRepository.save(user);

    }
}
