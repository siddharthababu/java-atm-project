package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class InvalidPinException extends Exception {
	public InvalidPinException (String errorMsg) {
		super(errorMsg);
	}

}
