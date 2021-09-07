package com.bridgelabz.regex;


public class EmailValidatorMain {
	public static void main(String[] args) {
		EmailValidator validator = new EmailValidator();
		String email = "abc.xyz@bridgelabz.co.in";
		System.out.println("Email: "+email);

		if(validator.validate(email)) {
			System.out.println("The email is in the required format");
		} else {
			System.out.println("The email is not in the required format!");
		}
	}
}
