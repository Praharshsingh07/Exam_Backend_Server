package com.exam.Repo;

import com.exam.model.Roles;
import com.exam.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles,Long> {
}
