package com.uber.motoristauber.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uber.motoristauber.model.Motorista;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Integer> {

    Optional<Motorista> findByCpf_motorista(String cpf_motorista);

    List<Motorista> findByPla_veiculo(String pla_veiculo);
}