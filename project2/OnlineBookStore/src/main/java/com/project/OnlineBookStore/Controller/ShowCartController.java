package com.project.OnlineBookStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowCartController {

	@GetMapping("/cartshow")
	public String showcart() {
		return "CartShow" ;
	}
}
