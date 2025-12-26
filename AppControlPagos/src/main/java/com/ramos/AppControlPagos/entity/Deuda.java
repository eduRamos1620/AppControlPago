package com.ramos.AppControlPagos.entity;

import com.ramos.AppControlPagos.enums.EstadoDeuda;
import com.ramos.AppControlPagos.enums.Estatus;
import com.ramos.AppControlPagos.enums.Periodo;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Deuda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal cantidad;
    private String motivo;
    private int tiempo;
    private LocalDateTime fechaAdquisicion;
    private int numeroPagos;
    private int numeroPagosdados;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEntidad", nullable = false)
    private Entidad entidad;

    @Enumerated(EnumType.STRING)
    private Estatus estatus = Estatus.ACTIVO;

    @Enumerated(EnumType.STRING)
    private Periodo periodo;

    @Enumerated(EnumType.STRING)
    private EstadoDeuda estadoDeuda;

    @OneToMany(mappedBy = "deuda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pago> listaPagos;

    @PrePersist
    public void prePersist() {
        if (estatus == null) {
            estatus = Estatus.ACTIVO;
        }
    }
}
