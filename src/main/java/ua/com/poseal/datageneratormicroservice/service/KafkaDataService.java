package ua.com.poseal.datageneratormicroservice.service;

import ua.com.poseal.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
