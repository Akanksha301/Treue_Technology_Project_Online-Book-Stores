package com.project.OnlineBookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineBookStore.Entity.RegisterBean;
import com.project.OnlineBookStore.Repository.RegRepo;


@Service
public class UserRegService {
 
	@Autowired
	private RegRepo repo ;
	
	public void saveDetails(RegisterBean user) {
		repo.save(user);
		
	}
	
}
