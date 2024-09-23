Kafka Commands Guide
This guide provides detailed explanations for common Kafka commands used in a Windows environment.
Table of Contents

Start ZooKeeper Server
Start Kafka Server
Create a Topic
List Topics
Describe a Topic
Produce Messages
Consume Messages
Upload CSV File
Best Practices

1. Start ZooKeeper Server
batchCopybin\windows\zookeeper-server-start.bat config\zookeeper.properties
Starts the ZooKeeper server, which is required for Kafka to operate. ZooKeeper manages the Kafka cluster state.
2. Start Kafka Server
batchCopybin\windows\kafka-server-start.bat config\server.properties
Initiates the Kafka server using the configuration specified in server.properties.
3. Create a Topic
batchCopybin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --topic ashu-kafka --partitions 3 --replication-factor 1
Creates a new Kafka topic named "ashu-kafka" with 3 partitions and a replication factor of 1.

--bootstrap-server localhost:9092: Specifies the Kafka server address.
--partitions 3: Divides the topic into 3 partitions for parallel processing.
--replication-factor 1: Sets the number of copies of each partition.

4. List Topics
batchCopybin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list
Displays a list of all topics in the Kafka cluster.
5. Describe a Topic
batchCopybin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic ashu-kafka
Provides detailed information about the "ashu-kafka" topic, including partitions and replicas.
6. Produce Messages
batchCopybin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic ashu-kafka
Starts a console producer to send messages to the "ashu-kafka" topic. After running this command, you can type messages and press Enter to send them.
7. Consume Messages
batchCopybin\windows\kafka-console-consumer.bat --broker-list localhost:9092 --topic ashu-kafka --from-beginning
Starts a console consumer to read messages from the "ashu-kafka" topic.

--from-beginning: Reads all messages from the start of the topic.

8. Upload CSV File
batchCopybin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic ashu-kafka < D:\SOA\sam.csv
Sends the contents of the sam.csv file as messages to the "ashu-kafka" topic.
