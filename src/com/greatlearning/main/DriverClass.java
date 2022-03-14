/**
 * 
 */
package com.greatlearning.main;

import java.util.HashMap;
import java.util.Scanner;

import com.greatlearning.model.Customer;
import com.greatlearning.service.BankingServices;

/**
 * @author Shreyas
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Making Object of Scanner Class
		Scanner sc = new Scanner(System.in);
		
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("123456785", "password");
		map.put("123484855", "password");
		map.put("784159626", "password");
		map.put("654867815", "password");
		
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("123456785", 6500);
		map1.put("123484855", 7000);
		map1.put("784159626", 13562);
		map1.put("654867815", 8494);
		

		//Welcome Message
		System.out.println("Welcome to the Login Page!\n");
		
		System.out.println("Enter the Bank Account Number : ");
		String bankAccoutNumber = sc.nextLine();
		
		System.out.println("\nEnter your Password : ");
		String passWord = sc.nextLine();
		
		
		Customer cr = new Customer(bankAccoutNumber, passWord);
		cr.setPassword(map);
		
		BankingServices bks = new BankingServices(map1, bankAccoutNumber);
		
		if(cr.getPassword().containsKey(bankAccoutNumber)) {
		
			int option;
			do {
			
				System.out.println("\n=================================================================================================\n");
				
				System.out.println("Enter the Operation you want to perform : ");
				System.out.println("1.Deposit\n2.Withdraw\n3.Transfer\n4.LogOut");
				option = sc.nextInt();
		
	
				switch(option) {
					case 1: System.out.println("Depositing...");
					bks.deposit();
					break;
		
					case 2: System.out.println("Withdrawing...");
					bks.withdraw();
					break;
		
					case 3: System.out.println("Transfering...");
					bks.transfer();
					break;
		
					case 4: System.out.println("Logging Out...");
					break;
		
					default: System.out.println("Invalid Option, Please try again!");
				}
			}while(option!=4);
		
			System.out.println("Thank You for Banking with Us!");
		}else {
			System.out.println("Account Number Doesn't EXIST!");
		}
		
		sc.close();
	}

}
