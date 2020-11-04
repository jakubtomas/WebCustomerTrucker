package sk.itsovy.tomas;

import sk.itsovy.tomas.validation.CourseCode;

import javax.validation.constraints.*;


public class Customer {

    private String firstName;

    @NotNull(message = "{notNullError}")
    @Size(min = 1, message = "{notNullError}")
    private String lastName;

    @NotNull(message = "{notNullError}")
    @Min(value = 0, message = "{freePassesMin}")
    @Max(value = 10, message = "{freePassesMax}")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "{regexError}")
    @NotNull(message = "{notNullError}")
    private String postalCode;


    // prepojenie s interface  funkciami value and message
    @CourseCode // (value= "TOPS", message= "must began with TOPS")  you can write condition here
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
