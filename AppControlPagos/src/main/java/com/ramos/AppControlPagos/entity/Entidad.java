package com.ramos.AppControlPagos.entity;

import com.ramos.AppControlPagos.enums.Estatus;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;

    @Enumerated(EnumType.STRING)
    private Estatus estatus = Estatus.ACTIVO;

    @PrePersist
    public void prePersist() {
        if (estatus == null) {
            estatus = Estatus.ACTIVO;
        }
    }   
}
