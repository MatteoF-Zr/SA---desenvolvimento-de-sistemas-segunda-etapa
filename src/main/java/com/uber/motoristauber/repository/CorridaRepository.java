package com.uber.motoristauber.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uber.motoristauber.model.Corrida;

public interface CorridaRepository extends JpaRepository<Corrida, Integer> {

    @Query("select c from Corrida c where c.motorista.id_motorista = :idMotorista")
    List<Corrida> findByMotoristaId(@Param("idMotorista") Integer idMotorista);

    List<Corrida> findByDat_corridaBetween(LocalDate inicio, LocalDate fim);
}