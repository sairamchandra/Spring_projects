package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = {lastname.class})
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface lnamevalid {
	String message() default "name should start from capital letterand don't leave  empty and length will be not lessthen 8 and not greaterthen 20";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };


}
