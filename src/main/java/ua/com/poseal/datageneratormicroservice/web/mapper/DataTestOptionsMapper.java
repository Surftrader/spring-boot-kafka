package ua.com.poseal.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ua.com.poseal.datageneratormicroservice.model.test.DataTestOptions;
import ua.com.poseal.datageneratormicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
