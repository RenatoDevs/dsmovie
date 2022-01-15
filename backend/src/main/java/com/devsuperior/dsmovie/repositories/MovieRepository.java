package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;
/*Para Poder add, excluir etc*/
public interface MovieRepository  extends JpaRepository<Movie,Long>{

}
