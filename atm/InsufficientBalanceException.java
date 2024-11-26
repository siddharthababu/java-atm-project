package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException (String errormsg) {
		super(errormsg);
	}

}
