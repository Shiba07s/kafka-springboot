package com.kafka_producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka_producer.service.KafkaMessagePublisher;

@RestController
@RequestMapping("/api/v1/produce")
public class EventController {
	
	@Autowired
	private KafkaMessagePublisher kafkaMessagePublisher;
	
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable String message){
		try {
			for (int i = 0; i <=10000; i++) {
				kafkaMessagePublisher.sendMessageToTopic(message+" : "+i);
			}
		
		return ResponseEntity.ok("message published successfully !!...");
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

}
