package com.nexim.nexim.services.report.MDFIR1000;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MDFIR1000_Repositoy extends JpaRepository<MDFIR1000_DAO, Long> {
    Optional<MDFIR1000_DAO> findById(long id);

}
