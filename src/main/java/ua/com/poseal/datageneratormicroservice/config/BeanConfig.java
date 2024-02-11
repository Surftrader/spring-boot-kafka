package ua.com.poseal.datageneratormicroservice.config;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class BeanConfig {

    /**
     * This method describes the Kafka producer configuration
     * from the file producer.xml
     *
     * @return XMLDocument
     */
    @SneakyThrows
    @Bean
    public XML producerXML() {
        return new XMLDocument(
                new File("src/main/resources/kafka/producer.xml")
        );
    }
}
