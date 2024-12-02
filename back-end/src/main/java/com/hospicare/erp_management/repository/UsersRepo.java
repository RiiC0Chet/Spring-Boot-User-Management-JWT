package com.hospicare.erp_management.repository;


import com.hospicare.erp_management.entity.OurUser;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepo extends JpaRepository<OurUser, Long> {
    Optional<OurUser> findByEmail(String email);
}
