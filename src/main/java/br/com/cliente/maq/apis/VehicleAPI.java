package br.com.cliente.maq.apis;

import javax.ws.rs.core.Response;

public interface VehicleAPI {
    Response getVehicle(String identification);
}
