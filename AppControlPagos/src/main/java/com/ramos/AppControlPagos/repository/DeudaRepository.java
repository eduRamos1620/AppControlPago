package com.ramos.AppControlPagos.repository;

import com.ramos.AppControlPagos.entity.Deuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeudaRepository extends JpaRepository<Deuda, Long> {
}
