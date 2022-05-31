package com.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class lastname implements ConstraintValidator<lnamevalid, String> {
	@Override
	public void initialize(lnamevalid lnamevalid) {
	}
	@Override
	public boolean isValid(String lname, ConstraintValidatorContext context) {
		
		return lname != null && lname.matches("^[A-Z]{1,20}$");
	}

}
