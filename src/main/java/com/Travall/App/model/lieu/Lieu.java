package com.Travall.App.model.lieu;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Lieu {
	
	@Id
	@Getter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String pays;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String itinéraire;
	
	public Lieu(String pays, String itinéraire) {
		this.pays = pays;
		this.itinéraire = itinéraire;
	}

	@ManyToOne
	private Lieu lieu;
}
