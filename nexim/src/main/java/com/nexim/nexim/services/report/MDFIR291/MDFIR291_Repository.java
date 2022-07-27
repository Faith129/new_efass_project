package com.nexim.nexim.services.report.MDFIR291;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MDFIR291_Repository extends JpaRepository<MDFIR291_DAO, Long> {
Optional<MDFIR291_DAO> findById(Long id);
}
