package com.ramos.AppControlPagos.service.impl;

import com.ramos.AppControlPagos.dto.EntidadDTO;
import com.ramos.AppControlPagos.entity.Entidad;
import com.ramos.AppControlPagos.repository.EntidadRepository;
import com.ramos.AppControlPagos.service.IEntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntidadService implements IEntidadService {

    @Autowired
    private EntidadRepository entidadRepository;

    @Override
    public List<EntidadDTO> findAll() {
        List<EntidadDTO> entidadListDto = entidadRepository.findAll()
                .stream().map(entidad -> EntidadDTO.builder()
                        .id(entidad.getIdEntidad())
                        .nombre(entidad.getNombre())
                        .tipo(entidad.getTipo())
                        .estatus(
                                entidad.getEstatus() != null ? entidad.getEstatus().name() : null
                        )
                        .build()
                ).toList();
        return entidadListDto;
    }

    @Override
    public Optional<EntidadDTO> findById(Long idEntidad) {
        Optional<Entidad> entidadOptional = entidadRepository.findById(idEntidad);

        if (entidadOptional.isPresent()){
            Entidad entidad = entidadOptional.get();

            EntidadDTO entidadDto = EntidadDTO.builder()
                    .id(entidad.getIdEntidad())
                    .nombre(entidad.getNombre())
                    .tipo(entidad.getTipo())
                    .estatus(
                            entidad.getEstatus() != null ? entidad.getEstatus().name() : null
                    )
                    .build();

            return Optional.of(entidadDto);
        }
        return Optional.empty();

    }

    @Override
    public void saveEntidad(Entidad entidad) {

    }

    @Override
    public void deleteEntidadLogico(Long idEntidad) {

    }
}
