package com.itranswarp.jsonstream;

/**
 * ValidateException represent a validation error.
 * 
 * @author Michael Liao
 */
public class ValidateException extends RuntimeException {

	private final String code;
	private final String path;

	public ValidateException(String code, String path) {
		super("Validation failed: " + path + ", not satisfied by: " + code);
		this.code = code;
		this.path = path;
	}

	public ValidateException(String code, String path, Throwable cause) {
		super("Validation failed: " + path + ", not satisfied by: " + code, cause);
		this.code = code;
		this.path = path;
	}

	String getCode() {
		return this.code;
	}

	String getPath() {
		return this.path;
	}
}
