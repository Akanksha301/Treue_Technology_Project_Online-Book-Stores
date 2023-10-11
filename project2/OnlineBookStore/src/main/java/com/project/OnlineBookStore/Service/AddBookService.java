package com.project.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineBookStore.Entity.AddBooks;
import com.project.OnlineBookStore.Repository.AddBookRepo;

@Service
public class AddBookService {

	@Autowired
	private AddBookRepo repo ;
	
	public void savebook(AddBooks add) {
		repo.save(add);
	}
}
