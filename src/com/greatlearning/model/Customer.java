/**
 * 
 */
package com.greatlearning.model;

import java.util.HashMap;

/**
 * @author Shreyas
 *
 */
public class Customer {

	
	private String bankAccountNo;
	private String passWord;
	
	public Customer() {
		
	}
	
	/**
	 * @param bankAccountNo
	 * @param passWord
	 */
	public Customer(String bankAccountNo, String passWord) {
		super();
		this.bankAccountNo = bankAccountNo;
		this.passWord = passWord;
		
	}
	
	private HashMap<String, String> password = new HashMap<String, String>();
	
	private HashMap<String, Integer> balance = new HashMap<String, Integer>();
	
	
	
	/**
	 * @return the password
	 */
	public HashMap<String, String> getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(HashMap<String, String> password) {
		this.password = password;
	}



	/**
	 * @return the balance
	 */
	public HashMap<String, Integer> getBalance() {
		return balance;
	}



	/**
	 * @param balance the balance to set
	 */
	public void setBalance(HashMap<String, Integer> balance) {
		this.balance = balance;
	}



	/**
	 * @return the bankAccountNo
	 */
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	/**
	 * @param bankAccountNo the bankAccountNo to set
	 */
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
	
}
