package com.bridgelabz.regex;

public class EmailValidator {
	public boolean validate(String email) {
		return email.matches("^abc[.a-z]*@bridgelabz.co[.a-z]*$");
	}
}
