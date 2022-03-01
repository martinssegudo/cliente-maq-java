package br.com.cliente.maq.apis.dotos.celcoin;

import lombok.Data;

import java.util.List;

@Data
public class CelcoinResponseTopupsProvideValuesDTO {
    private List<ProvideValueDTO> data;
}
