package com.engine.fakau.servicesale.domaine;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Basic(optional = false)
	private Long id;
	private String produits;
	private BigDecimal price;
	
	
	public Sale(Long id, String produits, BigDecimal price) {
		super();
		this.id = id;
		this.produits = produits;
		this.price = price;
	}
	public Sale() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduits() {
		return produits;
	}
	public void setProduits(String produits) {
		this.produits = produits;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", produits=" + produits + ", price=" + price + "]";
	}
	
	

}
