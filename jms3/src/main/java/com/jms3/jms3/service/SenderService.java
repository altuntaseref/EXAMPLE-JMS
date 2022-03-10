package com.jms3.jms3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jms3.jms3.model.Article;

@Service
@Component
public class SenderService {

	private JmsTemplate jmsTemplate;

	@Autowired
	public SenderService(JmsTemplate jmsTemplate) {
		super();
		this.jmsTemplate = jmsTemplate;
	}
	
	public void send(Article article) {
		
		this.jmsTemplate.convertAndSend("jms",article);
	}
	
	
}
