package com.devsuperior.dsmovie.entities;
/*Percistence é expecificação sempre preferir as especificações*/
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

/*Nome precisa estar correto igual ao que vai ser inserido no bd */
@Table(name = "tb_movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*Iniciais em Maiusculas, pois tipo classe*/
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	/*Construtor Vazio */
	public Movie() {
		
	}
	/*Construtor para receber os argumentos*/
	public Movie(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}
	
	/*Metodos de acesso*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
}
