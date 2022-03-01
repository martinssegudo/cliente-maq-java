package br.com.cliente.maq.mappers;

import br.com.cliente.maq.apis.dotos.celcoin.ProvideValueDTO;
import br.com.cliente.maq.services.entidades.celcoin.ProvideValue;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface ProvideValueMapper {
    ProvideValueDTO convertToProvideValue(ProvideValue provideValue);
}
