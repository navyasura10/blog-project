package com.blogwebsite.blog.services;

import com.blogwebsite.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
     User getUserById(UUID id);
}
