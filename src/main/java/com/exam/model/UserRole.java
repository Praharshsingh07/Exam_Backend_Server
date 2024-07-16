package com.exam.model;

import jakarta.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Roles roles;

    public UserRole() {
    }

    public UserRole(Long userRoleId, Roles roles, User user) {
        UserRoleId = userRoleId;
        this.roles = roles;
        this.user = user;
    }

    public UserRole(User user, Roles roles) {
        this.user = user;
        this.roles = roles;
    }

    public Long getUserRoleId() {
        return UserRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        UserRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
