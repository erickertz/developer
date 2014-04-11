package com.urbn.interviewtest;

public class Application {

	public static void main(String[] args) {
		new Application();
	}

	public Application() {
		RomanNumeralConverter converter = new RomanNumeralConverter();
		converter.problemOne();
		converter.problemTwo();
		converter.problemThree();
	}
}
