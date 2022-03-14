/**
 * 
 */
package com.greatlearning.service;

import java.util.Random;

/**
 * @author Shreyas
 *
 */
public class OTPGenerator {
	Random r = new Random();
	
	public int otp() {
		int otp = (int)(Math.random()*10000);
		
		if(otp>1000) {
			return otp;
		}else {
			return otp+9000;
		}
	}
}
