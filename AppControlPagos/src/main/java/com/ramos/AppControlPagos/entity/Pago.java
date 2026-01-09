package com.ramos.AppControlPagos.entity;

import com.ramos.AppControlPagos.enums.Estatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPago;

    private String descripcion;
    private BigDecimal cantidad;
    private LocalDateTime fechaPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDeuda", nullable = false)
    private Deuda deuda;

    private Estatus estatus = Estatus.ACTIVO;

    @PrePersist
    public void prePersist(){
        if (estatus == null){
            estatus = Estatus.ACTIVO;
        }
    }
}
