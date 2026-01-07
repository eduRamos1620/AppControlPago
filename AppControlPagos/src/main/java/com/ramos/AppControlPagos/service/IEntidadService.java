package com.ramos.AppControlPagos.service;

import com.ramos.AppControlPagos.dto.EntidadDTO;
import com.ramos.AppControlPagos.entity.Entidad;

import java.util.List;
import java.util.Optional;

public interface IEntidadService {
    List<EntidadDTO> findAll();

    Optional<EntidadDTO> findById(Long idEntidad);

    void saveEntidad(Entidad entidad);

    void deleteEntidadLogico(Long idEntidad);
}
