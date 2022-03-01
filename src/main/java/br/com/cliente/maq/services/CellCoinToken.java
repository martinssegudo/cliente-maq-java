package br.com.cliente.maq.services;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;

@Path("/v5/token")
@RegisterRestClient(configKey="cellcoin-token")
public interface CellCoinToken {

    public Token
}
