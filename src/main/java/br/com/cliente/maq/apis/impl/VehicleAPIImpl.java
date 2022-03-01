package br.com.cliente.maq.apis.impl;

import br.com.cliente.maq.apis.VehicleAPI;
import br.com.cliente.maq.apis.dotos.VehicleDTO;
import br.com.cliente.maq.apis.dotos.celcoin.CelcoinResponseTopupsProvideValuesDTO;
import br.com.cliente.maq.mappers.CelcoinResponseTopupsProvideValuesMapper;
import br.com.cliente.maq.mappers.ProvideValueMapper;
import br.com.cliente.maq.mappers.VehicleMapper;
import br.com.cliente.maq.services.CelcoinClient;
import br.com.cliente.maq.services.VehicleClient;
import br.com.cliente.maq.services.entidades.Vehicle;
import br.com.cliente.maq.services.entidades.celcoin.CelcoinResponseTopupsProvideValues;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("vehicle-client")
public class VehicleAPIImpl implements VehicleAPI {

    @Inject
    @RestClient
    private VehicleClient vehicleClient;
    @Inject
    @RestClient
    private CelcoinClient celcoinClient;

    @Inject
    private VehicleMapper vehicleMapper;
    @Inject
    private CelcoinResponseTopupsProvideValuesMapper mapperValues;
    @Inject
    private ProvideValueMapper provideValueMapper;


    @GET
    @Path("/{id}")
    @Override
    public Response getVehicle(@PathParam("id") String identification) {
        VehicleDTO dto = vehicleMapper.convertToVheicle(
                vehicleClient.findByIdentification(identification)
        );
        return Response.ok(dto).build();
    }


    @GET
    public Response getTopupValues(@QueryParam("stateCode") Integer stateCode,
                                   @QueryParam("providerId") Integer identification){
        CelcoinResponseTopupsProvideValuesDTO valuesDTO = mapperValues.converToCelcoinResponseTopupsProvideValues(
                celcoinClient.findByIdentification(stateCode, identification)
        );
        return Response.ok(valuesDTO).build();
    }
}
