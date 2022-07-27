package com.nexim.nexim.services.report.MDFIR271;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MDFIR271_Repository extends JpaRepository<MDFIR271_DAO, Long> {
    Optional<MDFIR271_DAO> findById(Long id);

   }
