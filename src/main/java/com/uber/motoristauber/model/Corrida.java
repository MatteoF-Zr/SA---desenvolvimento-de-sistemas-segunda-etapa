package com.uber.motoristauber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Corrida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String destino;

    @ManyToOne
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    private Aplicativo aplicativo;

    // Construtor vazio
    public Corrida() {
    }

    // Construtor com parâmetros
    public Corrida(String destino, Motorista motorista, String status) {
        this.destino = destino;
        this.motorista = motorista;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
