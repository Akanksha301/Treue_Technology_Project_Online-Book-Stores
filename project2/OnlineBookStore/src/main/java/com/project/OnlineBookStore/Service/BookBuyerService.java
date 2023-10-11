package com.project.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineBookStore.Entity.BookBuyers;
import com.project.OnlineBookStore.Repository.BookBuyerRepo;

@Service
public class BookBuyerService {

	@Autowired
	private BookBuyerRepo repo ;
	
	public void placedorder(BookBuyers buy) {
		repo.save(buy);
	}
}
