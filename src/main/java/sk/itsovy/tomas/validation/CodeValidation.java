package sk.itsovy.tomas.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidation implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override// interface code default value SVK , message  codeErrorMessage
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }
    //                                     courserPrefix = SVK

    @Override           // HTML form data , input from user            // helper class for additional error messages
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (theCode != null) { // test our code , does theCode start with SVK
            result = theCode.startsWith(coursePrefix);
        } else {
           return true;
        }

        return result;
    }
}
