package com.exam.Services.Impl;

import com.exam.Repo.RolesRepository;
import com.exam.Repo.UserRepository;
import com.exam.Services.UserService;
import com.exam.model.User;
import com.exam.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public User CreateUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("User Already Present");
            throw new Exception("User Already Exists");
        } else {
            for (UserRole ur : userRoles) {
                rolesRepository.save(ur.getRoles());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);
        }

        return local;
    }

    @Override
    public User findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void DeleteUserBYid(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public User UpdateUser(String username, User updatedUser) {
        User existingUser = this.userRepository.findByUsername(username);
        if (existingUser == null) {
            throw new RuntimeException("User not found");
        }

        // Update the user details
        existingUser.setFirstName(updatedUser.getFirstName());
        existingUser.setLastName(updatedUser.getLastName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPhone(updatedUser.getPhone());
        existingUser.setProfile(updatedUser.getProfile());

        // Save the updated user
        return this.userRepository.save(existingUser);
    }
}