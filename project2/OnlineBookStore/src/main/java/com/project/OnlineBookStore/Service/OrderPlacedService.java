package com.project.OnlineBookStore.Service;

import org.springframework.stereotype.Service;

import com.project.OnlineBookStore.Entity.BookBuyers;
import com.project.OnlineBookStore.Repository.OrderPlacedRepo;

@Service
public class OrderPlacedService {

	private OrderPlacedRepo repo ;
	
	public void ordersave(BookBuyers order) {
		repo.save(order);
	}
}
