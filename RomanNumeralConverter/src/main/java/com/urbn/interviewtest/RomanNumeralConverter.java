package com.urbn.interviewtest;

public class RomanNumeralConverter {

	public String RomanNumeralConverter(int numberToConvert) {
                String toReturn = "";
                
                for( ;  numberToConvert >= 1000  ;  numberToConvert -= 1000 )     toReturn += "M"   ;
                for( ;  numberToConvert >= 900   ;  numberToConvert -= 900  )     toReturn += "CM"  ;
                for( ;  numberToConvert >= 500   ;  numberToConvert -= 500  )     toReturn += "D"   ;
                for( ;  numberToConvert >= 400   ;  numberToConvert -= 400  )     toReturn += "CD"  ;
                for( ;  numberToConvert >= 100   ;  numberToConvert -= 100  )     toReturn += "C"   ;
                for( ;  numberToConvert >= 90    ;  numberToConvert -= 90   )     toReturn += "XC"  ;
                for( ;  numberToConvert >= 50    ;  numberToConvert -= 50   )     toReturn += "L"   ;
                for( ;  numberToConvert >= 40    ;  numberToConvert -= 40   )     toReturn += "XL"  ;
                for( ;  numberToConvert >= 10    ;  numberToConvert -= 10   )     toReturn += "X"   ;
                for( ;  numberToConvert >= 9     ;  numberToConvert -= 9    )     toReturn += "IX"  ;
                for( ;  numberToConvert >= 5     ;  numberToConvert -= 5    )     toReturn += "V"   ;
                for( ;  numberToConvert >= 4     ;  numberToConvert -= 4    )     toReturn += "IV"  ;
                for( ;  numberToConvert >= 1     ;  numberToConvert -= 1    )     toReturn += "I"   ;
                
                return toReturn;
	}

	public void problemOne() {
		final int NUMBER = 56;
		String solution = "";
                
                solution = RomanNumeralConverter(NUMBER);
                
		// TODO: Calculate the Roman Numeral equivalent of the value assigned to NUMBER

		System.out.println("The roman numeral value of " + NUMBER + " is: " + solution);
	}

	public void problemTwo() {
		final int NUMBER = 763;
		String solution = "";
                
                solution = RomanNumeralConverter(NUMBER);
                
		// TODO: Calculate the Roman Numeral equivalent of the value assigned to NUMBER

		System.out.println("The roman numeral value of " + NUMBER + " is: " + solution);
	}

	public void problemThree() {
		final int NUMBER = 3195;
		String solution = "";
                
                solution = RomanNumeralConverter(NUMBER);

		// TODO: Calculate the Roman Numeral equivalent of the value assigned to NUMBER

		System.out.println("The roman numeral value of " + NUMBER + " is: " + solution);
	}
}
