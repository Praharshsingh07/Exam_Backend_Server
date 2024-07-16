package com.exam;

import com.exam.Services.UserService;
import com.exam.model.Roles;
import com.exam.model.User;
import com.exam.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("server Running");

//		User user = new User();
//
//		user.setFirstName("Praharsh");
//		user.setLastName("Singh");
//		user.setEmail("praharshsingh07@gmail.com");
//		user.setUsername("ADMIN");
//		user.setProfile("praharsh.png");
//		user.setPhone("9340422243");
//
//		Roles role1 = new Roles();
//		role1.setRoleId(44L);
//		role1.setRoleName("Manager");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRoles(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//
//		User user1 = userService.CreateUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
//		System.out.println(user1.getFirstName());
	}
}