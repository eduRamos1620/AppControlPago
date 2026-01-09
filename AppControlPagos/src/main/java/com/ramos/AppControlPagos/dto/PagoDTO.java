package com.ramos.AppControlPagos.dto;

import com.ramos.AppControlPagos.entity.Deuda;
import com.ramos.AppControlPagos.enums.Estatus;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PagoDTO {
    private Long idPago;
    private String descripcion;
    private BigDecimal cantidad;
    private LocalDateTime fechaPago;
    private Deuda deuda;
    private Estatus estatus = Estatus.ACTIVO;
}
