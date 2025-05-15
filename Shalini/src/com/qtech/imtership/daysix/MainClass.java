package com.qtech.imtership.daysix;

public class MainClass {
	public static void main(String[]args) {
		BankAccount account=new BankAccount();
		try {
			account.Deposit(500);
		}
		catch(InvalisAmountException e) {
			System.out.println("Transaction error:"+e.getmessage());
			
		}
		account.displayBalance();
	}

}
