package com.nexim.nexim.services.report.MDFIR363;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MDFIR363_Repository extends JpaRepository<MDFIR363_DAO, Long> {
    Optional<MDFIR363_DAO> findById(Long id);
    //Optional<MDFIR363_DAO> deleteMDFIR363(Long id);
}
