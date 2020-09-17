package com.SpringDemo.mvc.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	public CourseCodeConstraintValidator() {
	}

	@Override
	public void initialize(CourseCode theCode) {
		coursePrefix = theCode.Value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if (value != null) {
			result = value.startsWith(coursePrefix);
		} else {
			result = true;
		}
		return result;
	}

}
