package ua.com.poseal.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ua.com.poseal.datageneratormicroservice.model.Data;
import ua.com.poseal.datageneratormicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
