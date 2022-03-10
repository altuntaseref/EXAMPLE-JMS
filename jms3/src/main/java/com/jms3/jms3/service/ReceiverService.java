package com.jms3.jms3.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.jms3.jms3.model.Article;

@Service
@Component
public class ReceiverService {

	Logger log = LoggerFactory.getLogger(ReceiverService.class);
	
	@JmsListener(destination = "jms")
	public void receiveMessage(Article article) {
		
		log.info("Received:  "+article);
		
	}
	
}
