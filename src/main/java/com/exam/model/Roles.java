package com.exam.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    private Long RoleId;
    private String RoleName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "roles")
    private Set<UserRole> userRoles = new HashSet<>();

    public Roles() {
    }


    public Roles(Long roleId, String roleName) {
        RoleId = roleId;
        RoleName = roleName;
    }

    public Roles(Long roleId, String roleName, Set<UserRole> userRoles) {
        RoleId = roleId;
        RoleName = roleName;
        this.userRoles = userRoles;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Long getRoleId() {
        return RoleId;
    }

    public void setRoleId(Long roleId) {
        RoleId = roleId;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }
}
