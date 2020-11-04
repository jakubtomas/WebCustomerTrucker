package sk.itsovy.tomas;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@RequestMapping("/customer")
@Controller
public class CustomerController {



    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }
    @RequestMapping("/processForm")// vyzaduje hodnutu customer a stejto hodnoty sa vytvory theCustomer
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {

        System.out.println("Result: " + result);
        if (result.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}

