package com.FlightReservations.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FlightReservations.Model.User;
import com.FlightReservations.Repository.UserRepository;



@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	
	@RequestMapping(value = "/registerUser" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		
		 userRepository.save(user);
		 return "login/login";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String login(@RequestParam("email") String email , @RequestParam("password") String password , ModelMap modelMap) {
		User values = userRepository.getByEmail(email);
		
		if(values.getPassword().equals(password)) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid username or password");
		}
		return "login/login";
	}
	
}
