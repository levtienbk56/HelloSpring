package tienlv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tienlv.edu.model.Customer;
import tienlv.edu.service.MainService;

@Controller
public class HomeController {

	@Autowired
	MainService mainService;

	@RequestMapping(value = { "home", "index" }, method = RequestMethod.GET)
	public String home() {
		return "homePage";
	}

	@RequestMapping(value = { "", "form" }, method = RequestMethod.GET)
	public ModelAndView form() {
		return new ModelAndView("formPage", "command", new Customer());
	}

	@RequestMapping(value = { "", "form" }, method = RequestMethod.POST)
	public String signup(@ModelAttribute("command") Customer customer, BindingResult result) {
		System.out.println(customer);
		
		
		return "redirect:home";
	}

}
