package com.ramos.AppControlPagos.repository;

import com.ramos.AppControlPagos.entity.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Long> {
}
