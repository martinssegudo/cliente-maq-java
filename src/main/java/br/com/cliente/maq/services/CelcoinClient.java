package br.com.cliente.maq.services;

import br.com.cliente.maq.services.entidades.celcoin.CelcoinResponseTopupsProvideValues;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/v5/transactions/topups")
@RegisterRestClient(configKey="cellcoin-api")
@ClientHeaderParam(name = "Authorization", value = "{getAuthorizationHeader}")
public interface CelcoinClient {


    default String getAuthorizationHeader(){
        final Config config = ConfigProvider.getConfig();
        return config.getValue("apiKey.stores", String.class);
    }

    @GET
    @Path("/provider-values")
    public CelcoinResponseTopupsProvideValues findByIdentification(@QueryParam("stateCode") Integer stateCode,
                                                                   @QueryParam("providerId") Integer identification);
}
