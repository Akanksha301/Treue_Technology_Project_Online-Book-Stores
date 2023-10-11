package com.project.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineBookStore.Entity.AddBooks;

@Repository
public interface AddBookRepo extends JpaRepository<AddBooks,Integer> {

}
