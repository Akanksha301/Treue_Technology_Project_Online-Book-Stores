package com.project.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineBookStore.Entity.RegisterBean;


@Repository
public interface RegRepo extends JpaRepository<RegisterBean , String>{

}
