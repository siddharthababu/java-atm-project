package com.codegnan.atmproject;
import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalnaceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotAOperatorException;
import com.codegnan.atmproject.IATMService;

@SuppressWarnings("unused")
public class OperatorCard implements IATMService {
	
	private int pinNumber;
	private long id;
	private String name;
	private final String type="operator";
	
	public OperatorCard(long id,int pin,String name) {
		id=id;
		pinNumber=pin;
		this.name=name;
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		
		return type;
	}

	@Override
	public double withdrawAmount(double wthAount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalnaceException {
		
		return 0;
	}

	@Override
	public void depositAmount(double deptAmount) throws InvalidAmountException {
		
		
	}

	@Override
	public double checkAccountBalance() {
		
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		
		
	}

	@Override
	public int getPinNumber() {
		
		return pinNumber;
	}

	@Override
	public String getUserName() {
		
		return name;
	}

	@Override
	public void decreaseChances() {
		
		
	}

	@Override
	public int getChances() {
		
		return 0;
	}

	@Override
	public void resetPinChances() {
		
		
	}

	@Override
	public void generateMiniStatement() {
		
		
	}

}