package com.project.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineBookStore.Entity.AddToCartEntity;
import com.project.OnlineBookStore.Repository.CartRepo;

@Service
public class CartService {

	@Autowired
	private CartRepo repo ;
	
	public void cartsave(AddToCartEntity cart) {
		repo.save(cart);
	}
}
