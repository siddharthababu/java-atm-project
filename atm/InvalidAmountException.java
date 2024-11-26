package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception {
	public InvalidAmountException(String errormsg) {
		super(errormsg);
	}

}
