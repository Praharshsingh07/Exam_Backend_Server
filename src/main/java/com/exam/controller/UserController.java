package com.exam.controller;

import com.exam.Services.UserService;
import com.exam.model.Roles;
import com.exam.model.User;
import com.exam.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public User CreateUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();

        Roles roles1 = new Roles(45L,"NORMALUSER");
        UserRole userRole = new UserRole(user,roles1);

        return this.userService.CreateUser(user,roles);

    }
    @GetMapping("/{username}")
    public  User getUser(@PathVariable("username") String username){

        return this.userService.findByUsername(username);
    }

    //delete user by userid
    @DeleteMapping("/{userid}")
    public void DeleteUser(@PathVariable("userid") Long id){
        this.userService.DeleteUserBYid(id);
    }
    @PutMapping("/{username}")
    public User UpdateUser(@PathVariable("username") String username, @RequestBody User updatedUser) {
        return this.userService.UpdateUser(username, updatedUser);
    }
}
