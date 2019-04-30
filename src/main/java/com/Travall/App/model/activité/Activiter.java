package com.Travall.App.model.activité;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.Travall.App.model.project.Project;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Activiter {
	
	@Id
	@Getter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String type;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String lieu;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private int coût;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private boolean approve;
	
	public Activiter(String type, String lieu, int coût, boolean approve) {
		this.lieu = lieu;
		this.type = type;
		this.coût = coût;
		this.approve = approve;
	}

	@ManyToOne
	private Project project;

}
