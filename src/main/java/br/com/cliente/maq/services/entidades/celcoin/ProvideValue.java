package br.com.cliente.maq.services.entidades.celcoin;

import lombok.Data;

@Data
public class ProvideValue {
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
