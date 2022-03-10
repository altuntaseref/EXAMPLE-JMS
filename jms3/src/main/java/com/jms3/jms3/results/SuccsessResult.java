package com.jms3.jms3.results;

public class SuccsessResult extends Result {
	
	public SuccsessResult() {
		super(true);
	}
	
	public SuccsessResult(String message) {
		super(true, message);
	}

}
