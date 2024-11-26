package com.codegnan.customExceptions;

@SuppressWarnings("serial")
public class InvalidCardException extends Exception{
	public InvalidCardException(String errorMsg) {
		super(errorMsg);
	}
}
