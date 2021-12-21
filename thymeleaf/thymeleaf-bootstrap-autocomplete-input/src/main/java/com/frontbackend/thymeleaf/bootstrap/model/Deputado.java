package com.frontbackend.thymeleaf.bootstrap.model;

public class Deputado {

	private Integer id;
	private String text;
	
	public Deputado() {
		
	}
	
	public Deputado(Integer id, String nome) {
		this.id = id;
		this.text = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
