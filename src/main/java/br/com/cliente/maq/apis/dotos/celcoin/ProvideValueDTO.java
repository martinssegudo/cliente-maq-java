package br.com.cliente.maq.apis.dotos.celcoin;

import lombok.Data;

@Data
public class ProvideValueDTO {
    private String code;
    private String cost;
    private String detail;
    private String productName;
    private String checkSum;
    private String dueProduct;
    private String valueBonus;
    private int maxValue;
    private int minValue;
}
