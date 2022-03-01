package br.com.cliente.maq.apis.dotos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private String identification;
    private String model;
    private String year;
    private String fabricator;
}
