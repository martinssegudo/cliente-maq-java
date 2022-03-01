package br.com.cliente.maq.mappers;

import br.com.cliente.maq.apis.dotos.VehicleDTO;
import br.com.cliente.maq.services.entidades.Vehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface VehicleMapper {
    Vehicle converToVehicleDTO(VehicleDTO vehicleDTO);
    VehicleDTO convertToVheicle(Vehicle vehicle);
}
