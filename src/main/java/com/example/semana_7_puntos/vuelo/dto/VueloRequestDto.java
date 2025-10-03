package com.example.semana_7_puntos.vuelo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class VueloRequestDto
{
    @NotBlank
    @Size(max=6)
    private String numeroVuelo;

    @NotNull
    @Min(1)
    private Integer asientosDisponibles;

    @NotNull
    private ZonedDateTime horaSalida;

    @NotNull
    private ZonedDateTime horaLlegada;


}
