package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
	public Etudiant(Object object, String string, String string2, Date date) {
		// TODO Auto-generated constructor stub
	}
	public Etudiant(Object object, String string, String string2, Date date, Formation f1) {
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	@ManyToOne
	@JoinColumn(name="ID_ET")
	private Formation formation;
	
}
	
