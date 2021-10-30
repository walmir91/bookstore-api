package com.walmir.bookstore.exceptions;

public class StandardErrors {

	private Long timeStamp;
	private Integer status;
	private String mensage;
	
	
	public StandardErrors() {
		super();
		
	}

	public StandardErrors(Long timeStamp, Integer status, String mensage) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.mensage = mensage;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}
	
	
}
