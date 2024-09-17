package com.springtest.testexam.Repositories;

import com.springtest.testexam.Entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {

    boolean existsByEmail(String email);
}