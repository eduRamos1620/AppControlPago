package com.ramos.AppControlPagos.repository;

import com.ramos.AppControlPagos.dto.EntidadDTO;
import com.ramos.AppControlPagos.entity.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Long> {

}
