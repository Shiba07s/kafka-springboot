Kafka Commands Guide
This guide provides detailed explanations for common Kafka commands used in a Windows environment, with a convenient copy feature for each command.
<details>
<summary>How to use the copy feature</summary>

Click on the "Copy" button next to any command.
The command will be copied to your clipboard.
You can then paste the command into your terminal or command prompt.

Note: The copy feature requires JavaScript to be enabled in your Markdown viewer.
</details>
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
<pre><code>bin\windows\zookeeper-server-start.bat config\zookeeper.properties</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\zookeeper-server-start.bat config\zookeeper.properties">Copy</button>
Starts the ZooKeeper server, which is required for Kafka to operate. ZooKeeper manages the Kafka cluster state.
2. Start Kafka Server
<pre><code>bin\windows\kafka-server-start.bat config\server.properties</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-server-start.bat config\server.properties">Copy</button>
Initiates the Kafka server using the configuration specified in server.properties.
3. Create a Topic
<pre><code>bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --topic ashu-kafka --partitions 3 --replication-factor 1</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --topic ashu-kafka --partitions 3 --replication-factor 1">Copy</button>
Creates a new Kafka topic named "ashu-kafka" with 3 partitions and a replication factor of 1.

--bootstrap-server localhost:9092: Specifies the Kafka server address.
--partitions 3: Divides the topic into 3 partitions for parallel processing.
--replication-factor 1: Sets the number of copies of each partition.

4. List Topics
<pre><code>bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list">Copy</button>
Displays a list of all topics in the Kafka cluster.
5. Describe a Topic
<pre><code>bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic ashu-kafka</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic ashu-kafka">Copy</button>
Provides detailed information about the "ashu-kafka" topic, including partitions and replicas.
6. Produce Messages
<pre><code>bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic ashu-kafka</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic ashu-kafka">Copy</button>
Starts a console producer to send messages to the "ashu-kafka" topic. After running this command, you can type messages and press Enter to send them.
7. Consume Messages
<pre><code>bin\windows\kafka-console-consumer.bat --broker-list localhost:9092 --topic ashu-kafka --from-beginning</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-console-consumer.bat --broker-list localhost:9092 --topic ashu-kafka --from-beginning">Copy</button>
Starts a console consumer to read messages from the "ashu-kafka" topic.

--from-beginning: Reads all messages from the start of the topic.

8. Upload CSV File
<pre><code>bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic ashu-kafka < D:\SOA\sam.csv</code></pre>
<button class="copy-button" data-clipboard-text="bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic ashu-kafka < D:\SOA\sam.csv">Copy</button>
Sends the contents of the sam.csv file as messages to the "ashu-kafka" topic.
