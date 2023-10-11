package com.project.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineBookStore.Entity.BookBuyers;


@Repository
public interface BookBuyerRepo extends JpaRepository<BookBuyers,String> {

}
