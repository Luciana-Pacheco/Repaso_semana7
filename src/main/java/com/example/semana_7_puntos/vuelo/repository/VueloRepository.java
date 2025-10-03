package com.example.semana_7_puntos.vuelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utec.vuelo.Vuelo;

public interface VueloRepository extends JpaRepository<Vuelo, Long> {
}
