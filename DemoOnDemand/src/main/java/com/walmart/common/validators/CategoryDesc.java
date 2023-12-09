package com.walmart.common.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

/*	We are writing this for Custom validation, 
 * instead of using pre defined 
 * spring annotations for validation
 *  we are creating
 *  our own custom validation.*/

@Constraint(validatedBy = CategoryDescConstarintValidator.class)
@Target({ElementType.FIELD ,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CategoryDesc {

	//define default category desc
	
	public String value() default "WALMART";

	//define default error messgae
	public String message() default "must start with WALMART";
	
	
	//define default groups
	
	public Class<?>[] groups() default {};
	/*
	 * Groups::: can group related constarints. In this scenario , not grouping with
	 * any other constarints
	 */
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
	
	/*
	 * Payloads : it provides custom details about validation failure such as
	 * severity level, error code, etc. In this scenario keeping empty as of now.
	 */	
	
	
}
