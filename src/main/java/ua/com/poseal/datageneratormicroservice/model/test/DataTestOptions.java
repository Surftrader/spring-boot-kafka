package ua.com.poseal.datageneratormicroservice.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.poseal.datageneratormicroservice.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;

}
