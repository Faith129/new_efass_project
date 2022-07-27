package com.nexim.nexim.repository;

import com.nexim.nexim.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);
    Boolean existsByUsername(String username);
    //Optional<Users> findByFullname(String fullname);
    Optional<Users> findByUserId (long userId);
   Optional<Users> deleteById(long userId);
    //Optional<Users> deleteByUsername(String username);
}
