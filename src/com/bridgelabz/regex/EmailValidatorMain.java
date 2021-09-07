package com.bridgelabz.regex;

public class EmailValidatorMain {
	public static void main(String[] args) {
		EmailValidator validator = new EmailValidator();

		String validEmails[] = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
		String unvalidEmails[] = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
				".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com",
				"abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };
		int validCount = 0;
		for (String email : validEmails) {

			if (!validator.validate(email)) {
				
				System.out.println("Email: " + email);
				System.out.println("The email is not in the required format!");
			} else {
				validCount++;
			}
		}
		System.out.println("No of Valid emails passed: "+validCount+"/"+validEmails.length);
		int unvalidCount = 0;

		for (String email : unvalidEmails) {

			if (validator.validate(email)) {
				unvalidCount++;
				System.out.println("Email: " + email);
				System.out.println("The email is in the required format");
			}
		}
		System.out.println("No of Unvalid emails passed: "+unvalidCount+"/"+unvalidEmails.length);

	}
}
