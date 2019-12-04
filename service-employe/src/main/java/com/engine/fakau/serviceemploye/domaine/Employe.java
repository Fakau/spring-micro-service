package com.engine.fakau.serviceemploye.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nom;
  private String prenom;
  private String post;
}
