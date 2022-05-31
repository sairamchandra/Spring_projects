package com.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameInputValidator implements ConstraintValidator<nameValidation, String> {

	 @Override
	    public void initialize(nameValidation namevalidation) {
	    }
	
	@Override
	public boolean isValid(String name,
			ConstraintValidatorContext cxt) {
		 return name != null &&name.matches("^[A-Z].*$");
	}

}
