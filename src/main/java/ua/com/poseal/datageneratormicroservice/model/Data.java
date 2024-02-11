package ua.com.poseal.datageneratormicroservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Data {

    //sensor id
    private Long sensorId;
    // time of sending information
    private LocalDateTime timestamp;
    // sensor parameters
    private double measurement;
    // sensor type
    private MeasurementType measurementType;

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }
}
