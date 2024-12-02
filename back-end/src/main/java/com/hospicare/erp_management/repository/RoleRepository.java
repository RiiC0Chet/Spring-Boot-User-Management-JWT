package com.hospicare.erp_management.repository;

import com.hospicare.erp_management.entity.OurUser;
import com.hospicare.erp_management.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}