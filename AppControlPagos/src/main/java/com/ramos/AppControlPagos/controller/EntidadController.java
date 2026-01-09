package com.ramos.AppControlPagos.controller;

import com.ramos.AppControlPagos.service.impl.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entidad")
public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping("/findAll")
    public ResponseEntity<?> listarNombreEntidad() {
        return ResponseEntity.ok(entidadService.findAll());
    }

    @GetMapping("/findById/{idEntidad}")
    public ResponseEntity<?> findById(@PathVariable Long idEntidad){
        return ResponseEntity.ok(entidadService.findById(idEntidad));
    }
}
