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

import com.uber.motoristauber.dto.MotoristaDTO;
import com.uber.motoristauber.service.MotoristaService;

@RestController
@RequestMapping("/api/motoristas")
public class MotoristaController {

    private final MotoristaService service;

    public MotoristaController(MotoristaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<MotoristaDTO>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{idMotorista}")
    public ResponseEntity<MotoristaDTO> buscar(@PathVariable Integer idMotorista) {
        return ResponseEntity.ok(service.buscarPorId(idMotorista));
    }

    @PostMapping
    public ResponseEntity<MotoristaDTO> criar(@RequestBody MotoristaDTO dto) {
        return ResponseEntity.ok(service.salvar(dto));
    }

    @PutMapping("/{idMotorista}")
    public ResponseEntity<MotoristaDTO> atualizar(@PathVariable Integer idMotorista, @RequestBody MotoristaDTO dto) {
        return ResponseEntity.ok(service.atualizar(idMotorista, dto));
    }

    @DeleteMapping("/{idMotorista}")
    public ResponseEntity<Void> deletar(@PathVariable Integer idMotorista) {
        service.excluir(idMotorista);
        return ResponseEntity.noContent().build();
    }
}