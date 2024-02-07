package ua.com.poseal.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.poseal.datageneratormicroservice.model.Data;
import ua.com.poseal.datageneratormicroservice.model.test.DataTestOptions;
import ua.com.poseal.datageneratormicroservice.service.KafkaDataService;
import ua.com.poseal.datageneratormicroservice.service.TestDataService;
import ua.com.poseal.datageneratormicroservice.web.dto.DataDto;
import ua.com.poseal.datageneratormicroservice.web.dto.DataTestOptionsDto;
import ua.com.poseal.datageneratormicroservice.web.mapper.DataMapper;
import ua.com.poseal.datageneratormicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }
}
