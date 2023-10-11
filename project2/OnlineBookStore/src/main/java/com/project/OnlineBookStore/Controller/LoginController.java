package com.project.OnlineBookStore.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.OnlineBookStore.Entity.LoginBean;
import com.project.OnlineBookStore.Repository.LoginRepository;

@Controller
public class LoginController {
	
	@Autowired
	private LoginRepository repo ;

	@GetMapping("/login")
	public String login(Model model) {
		LoginBean user = new LoginBean();
		model.addAttribute("user",user);
		return "Login" ;
	}
	
	@PostMapping("/logined")
	public String logined(@ModelAttribute("user") LoginBean user) {
		String username = user.getUsername();
		Optional<LoginBean> data = repo.findById(username);
		if(user.getPassword().equals(data.get().getPassword())) {
			return "LogSuccess" ;
		}
		else {
			return "Invalid" ;
		}
	}
}
