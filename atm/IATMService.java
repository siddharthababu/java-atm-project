package com.codegnan.atmproject;


import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalnaceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;

public interface IATMService {
	// to get the user type. Whether the user is operator or normal user.
	public abstract String getUserType()throws NotAOperatorException;
	
	// with draw amount these type of exceptions are occurred
	//1. will throw InValidAmountException - if the amount is not a valid amount.
	//2. will throw InSufficientBalanceException - if the customer has insufficient amount in his/her account.
	//3. will throw InSufficientMachineBalnaceException - if the machine has insufficient cash.
	public abstract double withdrawAmount(double wthAmount)
			throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalnaceException;
	
	// to deposit amount
	public abstract void depositAmount(double debtAmount)throws InvalidAmountException;
	
	// to check balance
	public abstract double checkAccountBalance();
	
	//to change pin number
	public abstract void changePinNumber(int pinNumber);
	
	// to get pin number
	public abstract int getPinNumber();
	
	//to get the user name
	public abstract String getUserName();
	
	//to decrease the number of chances while enter the wrong pin number.
	public abstract void decreaseChances();
	
	//to get the chances of pin number.
	public abstract int getChances();
	
	//to reset the pin number chances by rank operator.
	public abstract void resetPinChances();
	
	//to generate mini-statement.
	public abstract void generateMiniStatement();
	
	

}
