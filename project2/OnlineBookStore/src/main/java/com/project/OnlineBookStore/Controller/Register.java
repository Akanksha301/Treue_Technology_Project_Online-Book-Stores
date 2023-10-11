package com.project.OnlineBookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.OnlineBookStore.Entity.RegisterBean;
import com.project.OnlineBookStore.Repository.RegRepo;
import com.project.OnlineBookStore.Service.UserRegService;


@Controller
public class Register {
	
	@Autowired
	private UserRegService service ;
	
	@GetMapping("/register")
	public String register(Model model) {
		RegisterBean user = new RegisterBean();
		model.addAttribute("user",user);
		return "Register" ;
	}
	
	@PostMapping("/registered")
	public String registered(@ModelAttribute("user") RegisterBean user) {
		service.saveDetails(user);
		System.out.println(user);
		return "RegDone" ;
	}

}
