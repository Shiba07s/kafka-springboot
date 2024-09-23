package com.kafka_producer.service;

import java.sql.ResultSet;
import java.util.concurrent.CompletableFuture;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class KafkaMessagePublisher {

	private final KafkaTemplate<String, Object> template;

	public void sendMessageToTopic(String message) {
		CompletableFuture<SendResult<String, Object>> future = template.send("ashu-kafka4", message);
		
		future.whenComplete((result,ex)->{
		
		if (ex==null) {
            System.out.println("Sent message=[" + message + "] with Offset=[" + result.getRecordMetadata().offset() + "]");
		} else {
			System.out.println("Unable send message=[" +message+"] due to :" +ex.getMessage());
		}
		});
	}

}
