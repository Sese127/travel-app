package com.Travall.App.model.transport;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.Travall.App.model.project.Project;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Transport {
	
	@Id
	@Getter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private int Budget;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String type;
	
	public Transport(int Budget, String type) {
		this.Budget = Budget ;
		this.type = type;
	}

	@ManyToOne
	private Project project;
}
