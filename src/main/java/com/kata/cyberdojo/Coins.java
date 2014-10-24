package com.kata.cyberdojo;

public class Coins {

	public String changeOf(int cents) {
		String result = "";

		if (cents>=10) {
			result = getDimes(cents)  + getNickels(cents)  + getPennies(cents);
		}else{
			result =  getNickels(cents) + getPennies(cents);
			
		}
		

		return result;
	}

	private String getPennies(int cents) {
		return cents + " pennies";
	}

	private String getNickels(int cents) {
		int nickel = cents / 5;
		String result="";
		for(int numNickels = nickel; numNickels>0; numNickels--){
			result += numNickels + " nickel";
			int penniesLeft = cents - 5 * numNickels ;
			if (penniesLeft != 0) {
				result += " y " + getPennies(penniesLeft) ;
			}
			result+= " | ";
			
		}

		return result;
	}

	private String getDimes(int cents) { //20
		int dime = cents / 10;
		String result = dime+" dime | ";
		dime --;
		for(int numDimes = dime; numDimes>0; numDimes--){
			int dimesLeft = (cents - (numDimes * 10)) /5 ;
			result += numDimes + " dime";
			if(dimesLeft !=0){
				result += " y " + getNickels((cents - 10));
				
			}
		}
		for(int numDimes = dime; numDimes>0; numDimes--){
			int penniesLeft = cents - 10 * numDimes;
			result += numDimes + " dime";
			if(penniesLeft !=0){
				result += " y " + getPennies(penniesLeft);
			}
			result+= " | ";
		}
		return result;
	}

	

}
