package org.serratec.backend.individaualAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Titulo")
	@Size(max = 30)
	@Column(nullable = false, length = 30)
	private String titulo;

	@Embedded
	private Informacoes informacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Informacoes getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(Informacoes informacoes) {
		this.informacoes = informacoes;
	}
	
	
	
}
