package tienlv.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tienlv.edu.service.MainService;

@Controller
public class HomeController {

	@Autowired
	MainService mainService;

	@RequestMapping(value = { "", "home", "index" }, method = RequestMethod.GET)
	public String home() {
		return "homePage";
	}
}
