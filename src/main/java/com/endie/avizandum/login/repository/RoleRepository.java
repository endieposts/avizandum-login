package com.endie.avizandum.login.repository;

import com.endie.avizandum.login.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}