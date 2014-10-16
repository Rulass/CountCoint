package com.kata.cyberdojo;

public class CountCoins {

	public String changeOf(int end) {
		String result ="";
		for (int i=1 ; i<=end ; i++){
			if (i <= end){
				result += "1 pennie";
			}else if(i==5){
			return "1 nickel o 5 pennie";
			}else if(i==6){
			return "1 nickel y 1 pennie o 6 pennie";
			}else	if(i==7){
			return "1 nickel y 2 pennie o 7 pennie";
			}else	if(i==8){
			return "1 nickel y 3 pennie o 8 pennie";
			}else	if(i==9){
			return "1 nickel y 4 pennie o 9 pennie";
			}else	if(i==10){
			return "1 dime o 2 niquel o 1 niquel y 5 pennie o 10 penies";
		}else	if(i==11){
			return "1 dime y 1 pennie o 2 niquel y 1 pennie o 1 niquel y 6 pennie o 11 penies";
		}else	if(i==25){
			return "1 quarter";
		}else{
			result += i;
			}
		}
		return  result;
	}

}
