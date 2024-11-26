package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class NotAOperatorException extends Exception {
	public NotAOperatorException(String errorMsg) {
		super(errorMsg);
		
	}

}
