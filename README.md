# Springboot kafka
A simple project with a springboot kafka consumer and producer examples.
The producer and the consumer don't talk to each other because:  
 - The Json POJO form the producer doesn't match the Json POJO from the consumer.  
 - The proudcer doesn't publish to the same topic as the consumer
Changing the 2 mentioned points will allow them to talk to each other. 
