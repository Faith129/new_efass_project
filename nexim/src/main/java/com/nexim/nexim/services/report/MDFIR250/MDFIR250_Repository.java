package com.nexim.nexim.services.report.MDFIR250;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MDFIR250_Repository extends JpaRepository<MDFIR250_DAO, Long> {
    Optional<MDFIR250_DAO> findById(long id);
}
