package com.nexim.nexim.services.report.MDFIR300;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MDFIR300_Repository extends CrudRepository<MDFIR300_DAO, Long> {
    Optional<MDFIR300_DAO> findById(long id);

    @Query(value = "SELECT * FROM NEXIMEFASS.MDFIR300 where code=?", nativeQuery = true)
    Optional<MDFIR300_DAO> findByCode(String code);


    @Query(value = "SELECT * FROM NEXIMEFASS.MDFIR300 where code=?", nativeQuery = true)
    MDFIR300_DAO findColumnsByCode(String code);

}
