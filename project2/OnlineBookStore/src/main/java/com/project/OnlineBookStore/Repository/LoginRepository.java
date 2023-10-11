package com.project.OnlineBookStore.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineBookStore.Entity.LoginBean;


@Repository
public interface LoginRepository extends JpaRepository<LoginBean,String> {

	Optional<LoginBean> findById(String username);

}


