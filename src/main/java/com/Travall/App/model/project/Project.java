package com.Travall.App.model.project;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.Travall.App.model.activité.Activiter;
import com.Travall.App.model.date.Date;
import com.Travall.App.model.hébergement.Hébergement;
import com.Travall.App.model.lieu.Lieu;
import com.Travall.App.model.role.Role;
import com.Travall.App.model.transport.Transport;
import com.Travall.App.model.user.User;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Project {
	
	@Id
	@Getter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String name;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private int participant;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private int budget;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private int participantBudget;
	
	public Project(String name, int participant, int budget, int participantBudget) {
		this.name = name;
		this.participant = participant;
		this.budget = budget;
		this.participantBudget = participantBudget ;
	}

	@OneToMany
	private Activiter activiter;
	@OneToMany
	private Lieu lieu;
	@OneToMany
	private User user;
	@OneToMany
	private Transport transport;
	@OneToMany
	private Date date;
	@OneToMany
	private Hébergement hébergement;




}
