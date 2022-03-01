package br.com.cliente.maq.services.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private String identification;
    private String model;
    private String year;
    private String fabricator;
}
