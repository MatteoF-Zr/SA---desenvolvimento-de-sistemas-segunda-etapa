package com.uber.motoristauber.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uber.motoristauber.model.Aplicativo;

@Repository
public interface AplicativoRepository extends JpaRepository<Aplicativo, Integer> {

    Optional<Aplicativo> findByNom_aplicativo(String nom_aplicativo);

    List<Aplicativo> findByTax_plataformaGreaterThan(BigDecimal valor);
}