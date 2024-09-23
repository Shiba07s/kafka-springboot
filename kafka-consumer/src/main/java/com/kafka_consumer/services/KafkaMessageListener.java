package com.kafka_consumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
	
	Logger logger=LoggerFactory.getLogger(KafkaMessageListener.class);
	
	@KafkaListener(topics = "ashu-kafka3",groupId = "ashu-group-1")
	public void consumer(String message) {
		logger.info("consumer consume the message {} ",message);
	}

}
