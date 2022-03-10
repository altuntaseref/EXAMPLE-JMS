package com.jms3.jms3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

	private String name;
	private String text;
	
	 @Override
	    public String toString() {
	        return "Article{" +
	                "name='" + name + '\'' +
	                ", text='" + text + '\'' +
	                '}';
	    }
}
