package com.nexim.nexim.repository;

import com.nexim.nexim.model.EnumRole;
import com.nexim.nexim.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
       Optional<Role> findByName(EnumRole name);
}
