package ua.com.poseal.datageneratormicroservice.service;

import ua.com.poseal.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);

}
