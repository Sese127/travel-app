package com.Travall.App.model.date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.Travall.App.model.project.Project;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Date {
	
	@Id
	@Getter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String proposition;
	
	public Date(String proposition) {
		this.proposition = proposition;
	}

	@ManyToOne
	private Project project;
}
