package com.bridgelabz.regex;

public class EmailValidator {
	public boolean validate(String email) {
		return email.matches("^abc([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$");
	}
}
