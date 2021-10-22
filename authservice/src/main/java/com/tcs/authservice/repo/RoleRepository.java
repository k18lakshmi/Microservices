package com.tcs.authservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.authservice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
