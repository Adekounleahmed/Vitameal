package com.ipstcnam.vitameal.forms.exception;

public class MalformedFormException extends Exception {

	private static final long serialVersionUID = 6910138285736428846L;

	public MalformedFormException() {
		super();
	}

	public MalformedFormException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MalformedFormException(String message, Throwable cause) {
		super(message, cause);
	}

	public MalformedFormException(String message) {
		super(message);
	}

	public MalformedFormException(Throwable cause) {
		super(cause);
	}
	
	
	
}
