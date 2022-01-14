package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

/*Nome precisa estar correto igual ao que vai ser inserido no bd */
@Table(name = "tb_score")
public class Score {
	@EmbeddedId
	/* é necessario dar um new para garantir que este objeto está instanciado*/
	private ScorePK id = new ScorePK();
	
	private Double value;
	
	/*Construtor Vazio */
	public Score(){
		
	}
	/*Metodo Set do Filme*/
	
	/*Serve para associar o filme ao score */
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	public void setUser(User user) {
		id.setUser(user);
	}
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
	
}
