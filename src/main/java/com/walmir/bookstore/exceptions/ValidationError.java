package com.walmir.bookstore.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardErrors {

	private List<FieldMessage> errors = new ArrayList<>();
	
	public ValidationError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidationError(Long timeStamp, Integer status, String mensage) {
		super(timeStamp, status, mensage);
		// TODO Auto-generated constructor stub
	}

	
	public List<FieldMessage> getErrors() {
		return errors;
	}

	
	public void addErrors(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName, message));
	}

	
	
}
