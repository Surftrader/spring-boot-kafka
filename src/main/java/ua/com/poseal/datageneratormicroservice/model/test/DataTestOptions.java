package ua.com.poseal.datageneratormicroservice.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.com.poseal.datageneratormicroservice.model.Data;

/**
 * This class stores information about automatic sending of messages
 */
@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    // Automatic message sending interval
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;

}
