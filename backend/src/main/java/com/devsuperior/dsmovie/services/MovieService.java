package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;
/*é indispensável o uso da notation, em classes personalizadas, 
 * pois vai registrar como um componente do sistema*/
@Service
public class MovieService {
	
	/**/
	@Autowired
	private MovieRepository repository;
	
	
	/* List<MovieDTO> pois sera resolvido ai dentro e devolvido como
	 * DTO*/
	/*Pageable pageable para retornar em formato de paginas */
	
	@Transactional(readOnly = true)
	public Page<MovieDTO>findAll(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		/*Convertendo para DTO*/
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Movie result = repository.findById(id).get();
		/*Convertendo para DTO*/
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}
