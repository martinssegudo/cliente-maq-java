package br.com.cliente.maq.mappers;

import br.com.cliente.maq.apis.dotos.celcoin.CelcoinResponseTopupsProvideValuesDTO;
import br.com.cliente.maq.services.entidades.celcoin.CelcoinResponseTopupsProvideValues;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface CelcoinResponseTopupsProvideValuesMapper {
    CelcoinResponseTopupsProvideValuesDTO converToCelcoinResponseTopupsProvideValues(CelcoinResponseTopupsProvideValues values);
}
