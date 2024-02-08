# Spring Boot + Kafka

### Getting Started

1. [Download](https://kafka.apache.org/downloads#:~:text=kafka_2.13%2D3.6.1.tgz) Kafka release and extract it:
```
$ tar -xzf kafka_2.13-3.6.1.tgz
$ cd kafka_2.13-3.6.1
```
2. Start the Kafka environment

*Start the ZooKeeper service*
```
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
*Start the Kafka broker service*
```
$ bin/kafka-server-start.sh config/server.properties
```
3. Read the events (just data-temperature topic)
```
$ bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic data-temperature --from-beginning
```
