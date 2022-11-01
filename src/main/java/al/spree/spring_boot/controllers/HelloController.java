package al.spree.spring_boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("It's start page for PP task #2.3.1");
		messages.add("1.00 version by october'28 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}