package com.Travall.App.model.user;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.Travall.App.model.role.Role;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@Getter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String email;
	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String name;

	
	@Getter @Setter @NotEmpty @Column(unique=true)
	private String password;

	public User(String password, String name, String email /* , Role role */ ) {
		this.password = password;
		this.name = name;
		this.email = email;
	//	this.role = role;
	}
	
	//  @OneToMany
	// private Role role;



}
