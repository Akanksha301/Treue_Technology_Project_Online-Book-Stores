package com.project.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineBookStore.Entity.ReviewEntity;
import com.project.OnlineBookStore.Repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository repo ;
	
	public void reviewSave(ReviewEntity rate) {
		repo.save(rate);
	}
}
