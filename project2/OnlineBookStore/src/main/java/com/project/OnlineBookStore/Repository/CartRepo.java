package com.project.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineBookStore.Entity.AddToCartEntity;

@Repository
public interface CartRepo extends JpaRepository<AddToCartEntity,String>{

}
