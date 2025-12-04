package com.uber.motoristauber.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.motoristauber.dto.AplicativoDTO;
import com.uber.motoristauber.service.AplicativoService;

@RestController
@RequestMapping("/api/aplicativos")
public class AplicativoController {

    private final AplicativoService service;

    public AplicativoController(AplicativoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AplicativoDTO>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{idAplicativo}")
    public ResponseEntity<AplicativoDTO> buscar(@PathVariable Integer idAplicativo) {
        return ResponseEntity.ok(service.buscarPorId(idAplicativo));
    }

    @PostMapping
    public ResponseEntity<AplicativoDTO> criar(@RequestBody AplicativoDTO dto) {
        return ResponseEntity.ok(service.salvar(dto));
    }

    @PutMapping("/{idAplicativo}")
    public ResponseEntity<AplicativoDTO> atualizar(@PathVariable Integer idAplicativo, @RequestBody AplicativoDTO dto) {
        return ResponseEntity.ok(service.atualizar(idAplicativo, dto));
    }

    @DeleteMapping("/{idAplicativo}")
    public ResponseEntity<Void> deletar(@PathVariable Integer idAplicativo) {
        service.excluir(idAplicativo);
        return ResponseEntity.noContent().build();
    }
}