package com.example;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CityValidator implements ConstraintValidator<Cityvalid, String> {
	@Override
	public void initialize(Cityvalid cityvalid) {
	}

	@Override
	public boolean isValid(String city, ConstraintValidatorContext context) {


		return city != null && city.matches(".*pur$");

	}

}
