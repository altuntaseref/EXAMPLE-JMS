package com.jms3.jms3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Jms3Application {

	public static void main(String[] args) {
		
			SpringApplication.run(Jms3Application.class, args);
	/*ConfigurableApplicationContext context =
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		
		Article javaArticle = new Article(1, "Java Developer");
		jmsTemplate.convertAndSend("jms", javaArticle);*/
	
	
	
	}

}
