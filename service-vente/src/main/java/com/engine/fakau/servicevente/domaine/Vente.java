package com.engine.fakau.servicevente.domaine;

import java.math.BigDecimal;

import javax.persistence.Basic;
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
@AllArgsConstructor
@NoArgsConstructor  
@ToString
public class Vente {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Basic(optional = false)
	private Long id;
	private String produits;
	private BigDecimal price;
	

}
