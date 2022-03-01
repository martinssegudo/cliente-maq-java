package br.com.cliente.maq.services.entidades.celcoin;

import lombok.Data;

@Data
public class Token {
    private String access_token;
    private int expires_in;
    private String token_type;
}
