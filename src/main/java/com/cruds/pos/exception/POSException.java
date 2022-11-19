package com.cruds.pos.exception;

public class POSException extends Exception{
	
	private String exceptionInfo;

	public POSException(String exceptionInfo) {
		super();
		this.exceptionInfo = exceptionInfo;
	}

	public String getExceptionInfo() {
		return exceptionInfo;
	}

	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}

}
