/**
 * 
 */
package com.greatlearning.service;

import java.util.HashMap;
import java.util.Scanner;


/**
 * @author Shreyas
 *
 */
public class BankingServices {
	private HashMap<String, Integer> balance = new HashMap<String, Integer>();
	
	private String bankAccountNo;
	
	
	/**
	 * @param balance
	 */
	public BankingServices(HashMap<String, Integer> balance, String acc) {
		super();
		this.balance = balance;
		this.bankAccountNo = acc;
	}


	int bankBalance = balance.get(bankAccountNo);
	
	
	Scanner sc = new Scanner(System.in);
	OTPGenerator otpg = new OTPGenerator();
	
	public void deposit() {
		System.out.println("Enter the amount you want to deposit:");
		int amount = sc.nextInt();
		
		if(amount>0) {
			bankBalance = bankBalance+amount;
			System.out.println("You've deposited "+amount+" to your bank account.");
			System.out.println("Bank Balance Now: "+bankBalance);
		}else {
			System.out.println("Invalid Amount!");
		}
	}
	
	
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw:");
		int amount = sc.nextInt();
		
		if(amount<=bankBalance) {
			bankBalance = bankBalance-amount;
			System.out.println("You've withdrawed "+amount+" from your bank account.");
			System.out.println("Bank Balance now : "+bankBalance);
		}else {
			System.out.println("Insufficient Funds!");
		}
	}
	
	
	public void transfer() {
		System.out.println("Enter the Account Number to Transfer");
		int accountNumber = sc.nextInt();
		System.out.println("Enter the Amount:");
		int amount = sc.nextInt();
		
		
		if(amount<=bankBalance) {
			System.out.println("Enter OTP given below: ");
			int test = otpg.otp();
			System.out.println("OTP is : "+test);
			int otp = sc.nextInt();
			if(otp==test) {
				bankBalance = bankBalance-amount;
				System.out.println("Amount "+amount+" has been transferred to Account number : "+accountNumber);
				System.out.println("Bank Balance Now : "+bankBalance);
			}else {
				System.out.println("Incorrect OTP");
			}
		}else {
			System.out.println("Insufficient Funds!");
		}
		
	}
	
}
