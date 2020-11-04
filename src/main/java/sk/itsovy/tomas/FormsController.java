package sk.itsovy.tomas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/") // add to ulr address
public class FormsController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "student";
    }

    @RequestMapping("/processFormTwo")
    public String shout(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message", result);

        return "student";
    }

    @RequestMapping("/processFormThree")
    public String processFormThree(@RequestParam("studentName") String theName, Model model) {


        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        model.addAttribute("message", result);

        return "student";
    }

}
