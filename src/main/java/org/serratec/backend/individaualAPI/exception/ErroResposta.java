package org.serratec.backend.individaualAPI.exception;

import java.time.LocalDateTime;
import java.util.List;

public class ErroResposta {
	
	private Integer status;
	private String tit;
	private LocalDateTime dataHora;
	private List<String> erros;
	
	public ErroResposta(Integer status, String tit, LocalDateTime dataHora, List<String> erros) {
		this.status = status;
		this.tit = tit;
		this.dataHora = dataHora;
		this.erros = erros;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTit() {
		return tit;
	}
	public void setTit(String tit) {
		this.tit = tit;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public List<String> getErros() {
		return erros;
	}
	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
	
	
	
	
}
