package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;
/*Para Poder add, excluir etc*/
public interface UserRepository  extends JpaRepository<User,Long>{
	
	User findByEmail(String email);
}
