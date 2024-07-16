package com.exam.Services;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {
    //fun to create user
    public User CreateUser(User user, Set<UserRole> userRoles) throws Exception;

    User findByUsername(String username);

    void DeleteUserBYid(Long id);

    User UpdateUser(String username, User updatedUser);
}
