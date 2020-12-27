# Kafka consumer with springboot

A simple example for a kafka consumer with springboot.

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

step6: Create a simple kafka topic producer

```shell
$term3>> bin/kafka-console-producer.sh --broker-list localhost:9092 --topic <kafka_topic_name> 
```