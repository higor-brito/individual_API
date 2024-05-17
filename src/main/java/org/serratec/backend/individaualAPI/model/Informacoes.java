package org.serratec.backend.individaualAPI.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Informacoes {
	
	private String editora;
	private String dt_publicacao;
	private String autor;
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getDt_publicacao() {
		return dt_publicacao;
	}
	public void setDt_publicacao(String dt_publicacao) {
		this.dt_publicacao = dt_publicacao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
