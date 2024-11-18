package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Usuario {

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table(name = "usuario")
	
	public class Usuario{
		@Id
		@GeneratedValue
	}
}
