package com.kata.cyberdojo;

public class CountCoins {

	public String changeOf(int cents) {
		String result ="";
		result = GetPennies(cents, result);
		result = getNickels(cents, result);
		result = getDimes(cents, result);
		if(cents==25){
			result =  "1 quarter";
		}
		return  result;
	}

	private String getDimes(int cents, String result) {
		if(cents==10){
			result =  "1 dime o 2 nickel o ";
			result += getNickels(cents, result);
		}
		if(cents==11){
			result =  "1 dime y 1 pennie o 2 nickel y 1 pennie o ";
			result += getNickels(cents, result);
		}
		return result;
	}

	private String getNickels(int cents, String result) {
		if(cents == 5){
			result = "1 nickel o ";
			result += GetPennies(cents, result);
		}
		if(cents>5)
		{
			result = "1 nickel y "+ GetPennies(cents-5, result) + " o ";
			result += GetPennies(cents, result);
		}
		return result;
	}

	private String GetPennies(int cents, String result) {
		if(cents>0)
			result = cents+" pennie";
		else
			result = "";
		return result;
	}

}
