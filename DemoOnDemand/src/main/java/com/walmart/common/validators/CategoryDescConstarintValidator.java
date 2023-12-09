package com.walmart.common.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CategoryDescConstarintValidator implements ConstraintValidator<CategoryDesc, String>{


	private String categoryPrefix;
	
	@Override
	public void initialize(CategoryDesc categoryDesc) {
		categoryPrefix= categoryDesc.value();
		
	}
	
	
	
	
	
	
	
	@Override
	public boolean isValid(String categoryDesc, ConstraintValidatorContext context) {
		boolean result;
		if(null!=categoryDesc) {
		result= categoryDesc.startsWith(categoryPrefix);
		}
		else {
			result=true;
		}
		return result;
	}

}
