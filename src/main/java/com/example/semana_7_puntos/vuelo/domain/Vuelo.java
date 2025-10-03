package com.example.semana_7_puntos.vuelo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroVuelo;

    @Column(nullable = false)
    private Integer asientosDisponibles;

    @Column(nullable = false)
    private ZonedDateTime horaSalida;

    @Column(nullable = false)
    private ZonedDateTime horaLlegada;

}
