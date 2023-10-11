package com.project.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineBookStore.Entity.ReviewEntity;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity,String> {

}
