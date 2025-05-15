package com.qtech.imtership.daysix;

public class BankAccount {
    private int accountno;
    private double balance;
    public int getAccount() {
    	return accountno;
    }
    public void setAccountno(int accountno) {
    	this.accountno = accountno;
    }
    public double getBalance() {
    	return balance;
    }
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    @Override
	public String toString() {
		return "BankAccount [accountno=" + accountno + ", balance=" + balance + "]";
	}
	public BankAccount() {

        super();	
    	
    }
	public BankAccount(int accountno, double balance) {
		super();
		this.accountno = accountno;
		this.balance = balance;
	}
void deposit(double amount) throws InvaliadAmountException {
	if (amount<=0) {
		throw new InvalidaAmountException("Deposit amount must be positive:");
	}
	else {
		balance=balance+amount;
		System.out.println("Deposited:"+amount);
	}	
	void withraw(doublel amount)throws InvalisAmountException{
		if(amount<=0) {
			throw new InvalisAmountExecption("withdraw amount mustbe lessthan amount:");
		else {
			balance=balance-amount;
			System.out.println("wiithdraw:"+amount);
			}
		void displayBalance() {
			System.out.println("current balance:"+balance);
			}
		
		}
		
	
}
	

	

	
	
	

