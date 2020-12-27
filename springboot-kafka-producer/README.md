# Kafka producer with springboot

A simple example for a kafka producer with springboot.

# Run kafka

step1: Install kafka.  
step2: Unzip and ```cd``` to the downloaded file.  
step3: Run zookeeper

```shell
$term1>> bin/zookeeper-server-start.sh config/zookeeper.properties
```

step4: Run kafka server

```shell
$term2>> bin/kafka-server-start.sh config/server.properties
```

step5: Create desired kafka topic

```shell
$term3>> bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic <kafka_topic_name>
```

step6: Create kafka topic consumer

```shell
$term3>> bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic <kafka_topic_name> --from-beginning
```


# Publish a Json 
Send a GET request to ```http://localhost:8081/kafka/publish/{user_name}``` and the service will publish a Json message to "Kafka_topic" topic. Result can be seen on the consumer from ```$term3```.
