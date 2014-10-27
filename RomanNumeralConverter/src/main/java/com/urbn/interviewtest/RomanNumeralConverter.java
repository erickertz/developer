package com.urbn.interviewtest;

public class RomanNumeralConverter {

	public String RomanNumeralConverter(int NUMBER) {
		String returnVal = "";
		while(NUMBER > 0) {
			if(NUMBER >= 1000) { returnVal += "M"; NUMBER -= 1000; continue; }
			if(NUMBER >= 900) { returnVal += "CM"; NUMBER -= 900; continue; }
			if(NUMBER >= 500) { returnVal += "D"; NUMBER -= 500; continue; }
			if(NUMBER >= 400) { returnVal += "CD"; NUMBER -= 400; continue; }
			if(NUMBER >= 100) { returnVal += "C"; NUMBER -= 100; continue; }
			if(NUMBER >= 90) { returnVal += "XC"; NUMBER -= 90; continue; }
			if(NUMBER >= 50) { returnVal += "L"; NUMBER -= 50; continue; }
			if(NUMBER >= 40) { returnVal += "XL"; NUMBER -= 40; continue; }
			if(NUMBER >= 10) { returnVal += "X"; NUMBER -= 10; continue; }
			if(NUMBER >= 9) { returnVal += "IX"; NUMBER -= 9; continue; }
			if(NUMBER >= 5) { returnVal += "V"; NUMBER -= 5; continue; }
			if(NUMBER >= 4) { returnVal += "IV"; NUMBER -= 4; continue; }
			if(NUMBER >= 1) { returnVal += "I"; NUMBER -= 1; continue; }
		}
		return returnVal;
	}
	
	public boolean RomanNumeralValidator(int NUMBER) {
		boolean returnVal = false;
		if(NUMBER > 0 && NUMBER < 4999){
			returnVal = true;
		}
		return returnVal;
	}

	public void problemOne() {
		final int NUMBER = 56;
		if(this.RomanNumeralValidator(NUMBER)){
			String solution = this.RomanNumeralConverter(NUMBER);
			System.out.println("The roman numeral value of " + NUMBER + " is: " + solution);	
		} else {
			System.out.println("Number must be in the range of 1 - 4999");	
		}
	}

	public void problemTwo() {
		final int NUMBER = 763;
		if(this.RomanNumeralValidator(NUMBER)){
			String solution = this.RomanNumeralConverter(NUMBER);
			System.out.println("The roman numeral value of " + NUMBER + " is: " + solution);	
		} else {
			System.out.println("Number must be in the range of 1 - 4999");	
		}
	}

	public void problemThree() {
		final int NUMBER = 3195;
		if(this.RomanNumeralValidator(NUMBER)){
			String solution = this.RomanNumeralConverter(NUMBER);
			System.out.println("The roman numeral value of " + NUMBER + " is: " + solution);	
		} else {
			System.out.println("Number must be in the range of 1 - 4999");	
		}
	}
}
