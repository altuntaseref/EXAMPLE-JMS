package com.jms3.jms3.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jms3.jms3.model.Article;
import com.jms3.jms3.results.Result;
import com.jms3.jms3.results.SuccsessResult;


@RestController
public class MessageController {

	private JmsTemplate jmsTemplate;
	
	@Autowired
	public MessageController(JmsTemplate jmsTemplate) {
		super();
		this.jmsTemplate = jmsTemplate;
	}

	
	@PostMapping("/send")
	public Result send(@RequestBody(required = false) Article article) {
		
		this.jmsTemplate.convertAndSend("jms",article);
		return new SuccsessResult("Mesaj gönderildi");
		
	}
	
	
}
