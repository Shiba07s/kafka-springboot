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
Best Practices

Always start ZooKeeper before starting the Kafka server.
Ensure that the specified ports (e.g., 9092) are available and not blocked by firewalls.
When creating topics, consider your data volume and processing requirements to determine the appropriate number of partitions.
Use descriptive topic names to easily identify the purpose of each topic.
Regularly monitor and describe your topics to ensure they are configured correctly.
When consuming messages in a production environment, consider using consumer groups for load balancing and fault tolerance.

<script src="https://cdnjs.cloudflare.com/ajax/libs/clipboard.js/2.0.8/clipboard.min.js"></script>
<script>
new ClipboardJS('.copy-button');
</script>
<style>
.copy-button {
    margin-left: 10px;
    padding: 5px 10px;
    background-color: #f1f1f1;
    border: 1px solid #ccc;
    border-radius: 3px;
    cursor: pointer;
}
.copy-button:hover {
    background-color: #e1e1e1;
}
pre {
    background-color: #f4f4f4;
    border: 1px solid #ddd;
    border-left: 3px solid #f36d33;
    color: #666;
    page-break-inside: avoid;
    font-family: monospace;
    font-size: 15px;
    line-height: 1.6;
    margin-bottom: 1.6em;
    max-width: 100%;
    overflow: auto;
    padding: 1em 1.5em;
    display: block;
    word-wrap: break-word;
}
</style>
