package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorldController {

	@RequestMapping(value = "/home")
	public ModelAndView goHome() {
		ModelAndView home = new ModelAndView("home");
		home.addObject("hello", "Hello guy! What can I do for you?");
		
		return home;
	}
}
