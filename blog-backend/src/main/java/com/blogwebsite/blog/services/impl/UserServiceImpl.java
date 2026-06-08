package com.blogwebsite.blog.services.impl;

import com.blogwebsite.blog.domain.entities.User;
import com.blogwebsite.blog.repositories.UserRepository;
import com.blogwebsite.blog.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User getUserById(UUID id) {
        return  userRepository.findById(id)
                 .orElseThrow(()-> new EntityNotFoundException("User not found with ID"+id));
    }
}
