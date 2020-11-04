package sk.itsovy.tomas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        // create new a student
        Student student = new Student();

        // add student object to the model
        model.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processForm")// model student data Student Object
    public String processForm(@ModelAttribute("student") Student student) {

        // model student je object Student a mama pristup v student-confirmation

        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());

        return "student-confirmation";
    }

}
