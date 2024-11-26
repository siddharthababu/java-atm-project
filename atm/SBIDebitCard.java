package com.codegnan.cards;

import java.util.ArrayList;
import java.util.Collections;

import com.codegnan.atmproject.IATMService;
import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalnaceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;

public class SBIDebitCard implements IATMService {
	String name;
	long debitCardNumber;
	double accountBalance;
	int pinNumber;
	ArrayList<String> statement;
	final String type = "user";
	int chances;
	public SBIDebitCard(long debitCardNumber, String name, double accountBalance, int pinNumber) {
		chances = 3;
		this.name = name;
		this.accountBalance = accountBalance;
		this.pinNumber = pinNumber;
		statement = new ArrayList<>();
	}

	public String getUserType() throws NotAOperatorException {
		return type;
	}

	@Override
	public double withdrawAmount(double wthAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalnaceException {
		if (wthAmount <= 0) {
			throw new InvalidAmountException("you enter zero amount to withdraw please enter valid amount");
		} else if (wthAmount % 100 != 0) {
			throw new InvalidAmountException("please withdraw multiples of 100");
		} else if (wthAmount < 500) {
			throw new InsufficientBalanceException("please withdraw morethan Rs.500");
		} else if (wthAmount > accountBalance) {
			throw new InsufficientBalanceException(
					"You don't have suficient balance to withdraw amount please check your account balance");
		} else {
			accountBalance = accountBalance - wthAmount;
			statement.add("Debited : " + wthAmount);
			return wthAmount;
		}
	}

	public void depositAmount(double debtAmount) throws InvalidAmountException {
		if (debtAmount <= 0 || debtAmount % 100 != 0 || debtAmount < 500) {
			throw new InvalidAmountException("please deposit multiples of 100 and deposit more than 500");

		} else {
			accountBalance = accountBalance + debtAmount;
			statement.add("credited: " + debtAmount);
		}
	}
	@Override
	public double checkAccountBalance() {
		return accountBalance;
	}
	@Override
	public void changePinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void decreaseChances() {
		--chances;
	}
	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return chances;
	}
	@Override
	public void resetPinChances() {
		chances = 3;
	}
	@Override
	public void generateMiniStatement() {
		int count =5;
		if (statement.size() == 0) {
			System.out.println("There are no Transactions Happend");
			return;
		}
		System.out.println("============List 5 Transactions=============");
		Collections.reverse(statement);
		for(String trans:statement) {
			if(count ==0) {
				break;
			}
			System.out.println(trans);
			count--;
		}
		Collections.reverse(statement);
	}
}

