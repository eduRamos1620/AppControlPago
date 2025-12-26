package com.ramos.AppControlPagos.dto;

import com.ramos.AppControlPagos.enums.Estatus;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EntidadDTO {
    private Long id;
    private String nombre;
    private String tipo;
    private Estatus estatus = Estatus.ACTIVO;
}
