package tienlv.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tienlv.edu.model.Customer;

@Controller
public class FormController {

	@ModelAttribute
	public Customer createCustomer() {
		return new Customer();
	}

	@RequestMapping(value = "form", method = RequestMethod.GET)
	public String form() {
		return "formPage";
	}

	@RequestMapping(value = "form/validate", method = RequestMethod.POST)
	public String signup(@Validated Customer customer, BindingResult result) {
		System.out.println(customer);
		if (result.hasErrors()) {
			for (ObjectError error : result.getAllErrors()) {
				System.out.println(error.getDefaultMessage());
				System.out.println(error.getObjectName());
				System.out.println(error.getClass());
			}
			return "formPage";
		}
		return "redirect:/home";
	}
}
