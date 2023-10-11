package com.project.OnlineBookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.OnlineBookStore.Entity.AddBooks;
import com.project.OnlineBookStore.Service.AddBookService;

@Controller
public class AddBooksController {

	@Autowired
	private AddBookService service ;
	
	
	@GetMapping("/addbook")
	public String addbook(Model model) {
		AddBooks add = new AddBooks();
		model.addAttribute("add", add);
		return "AddBook" ;
	}
	
	@PostMapping("/bookadded")
	public String bookadded(@ModelAttribute("add") AddBooks add) {
		service.savebook(add);
		System.out.println(add);
		return "Donee" ;
	}
}
