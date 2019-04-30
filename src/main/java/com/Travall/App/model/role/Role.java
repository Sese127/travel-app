package com.Travall.App.model.role;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.Travall.App.model.user.User;
import lombok.Getter;
import lombok.Setter;


@Entity
	public class Role {
		
		@Id
		@Getter
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@Getter @Setter @NotEmpty @Column(unique=true)
		private String name;
		
		public Role(String name) {

			this.name = name;
		}

		@ManyToOne
		private User user;
	}
