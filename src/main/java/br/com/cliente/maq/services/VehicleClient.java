package br.com.cliente.maq.services;

import br.com.cliente.maq.services.entidades.Vehicle;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("vehicle")
@RegisterRestClient(configKey="vehicle-api")
public interface VehicleClient {

    @GET
    @Path("/{ident}")
    public Vehicle findByIdentification(@PathParam("ident") String identification);
}
