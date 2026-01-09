package com.ramos.AppControlPagos.dto;

import com.ramos.AppControlPagos.entity.Entidad;
import com.ramos.AppControlPagos.entity.Pago;
import com.ramos.AppControlPagos.enums.EstadoDeuda;
import com.ramos.AppControlPagos.enums.Estatus;
import com.ramos.AppControlPagos.enums.Periodo;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeudaDTO {
    private Long id;
    private BigDecimal cantidad;
    private String motivo;
    private int tiempo;
    private LocalDateTime fechaAdquisicion;
    private int numeroPagos;
    private int numeroPagosdados;
    private Entidad entidad;
    private Estatus estatus = Estatus.ACTIVO;
    private Periodo periodo;
    private EstadoDeuda estadoDeuda;
    private List<Pago> listaPagos;

}
