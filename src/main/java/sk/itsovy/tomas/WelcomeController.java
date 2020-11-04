package sk.itsovy.tomas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class WelcomeController {

    @RequestMapping("")
    public String welcome(Model model) {

        model.addAttribute("message", "Hello spring send from model data from Welcome controller ");

        return "welcome";
    }

}
