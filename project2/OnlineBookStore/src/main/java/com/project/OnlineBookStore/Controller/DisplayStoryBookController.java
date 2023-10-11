package com.project.OnlineBookStore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.OnlineBookStore.Entity.AddBooks;
import com.project.OnlineBookStore.Entity.AddToCartEntity;
import com.project.OnlineBookStore.Entity.BookBuyers;
import com.project.OnlineBookStore.Entity.ReviewEntity;
import com.project.OnlineBookStore.Repository.AddBookRepo;
import com.project.OnlineBookStore.Service.BookBuyerService;
import com.project.OnlineBookStore.Service.CartService;
import com.project.OnlineBookStore.Service.OrderPlacedService;
import com.project.OnlineBookStore.Service.ReviewService;

import jakarta.servlet.http.HttpSession;

@Controller()
public class DisplayStoryBookController {

	@Autowired
	private AddBookRepo repo ;
	
	@Autowired
	private BookBuyerService servi ;
	
	@Autowired
	private OrderPlacedService service ;
	
	@Autowired
	private ReviewService serv ;
	
	@Autowired
	private CartService ser ;
	
	@GetMapping("/storybook")
	public String displaystorybook(Model model) {
		List books = repo.findAll();
		model.addAttribute("books",books);
		return "StoryBooks" ;
	}
	
	@GetMapping("/buying/{id}")
	public String buying(@PathVariable(value="id" ) int id , Model model ,HttpSession session) {
		
		Optional<AddBooks> buy = repo.findById(id);
		AddBooks buying = buy.get() ;
		
		String username = (String) session.getAttribute("username");
		int Id = buy.get().getId();
		
		BookBuyers order = new BookBuyers();
		model.addAttribute("order",order);
		order.setId(Id);
		order.setUsername(username);
		
		model.addAttribute("order",order);
		return "BuyingBook" ;
	}
	
	@PostMapping("/buyed")
	public String buyed(@ModelAttribute("order") BookBuyers order) {
		servi.placedorder(order);
		System.out.println(order);
		return "Donee";
	}
	
	@GetMapping("/addtocart/{id}")
	public String addCart(@PathVariable(value="id" ) int id ,Model model ,HttpSession session) {
		return "AddCart" ;
	}
	
	@PostMapping("/addedCart")
	public String addedCart(@ModelAttribute("cart") AddToCartEntity cart) {
		return "cartSucc" ;
	}
	
	@GetMapping("/review/{id}")
	public String review(@PathVariable(value="id" ) int id ,Model model ,HttpSession session) {
		
		return "Review" ;
	}
	
	@PostMapping("/reviwed")
	public String reviwed(@ModelAttribute("rate") ReviewEntity rate) {
		return "revSuccess" ;
	}
	
}
