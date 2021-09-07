package com.bridgelabz.regex;

public class EmailValidator {
	public boolean validate(String email) {
		return email.matches("^abc?(?(.)[a-z0-9_+-]+)@bridgelabz.co?(.)[a-z]{2,}$");
	}
}
