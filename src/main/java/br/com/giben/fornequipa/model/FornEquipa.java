package br.com.giben.fornequipa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("itemservico")
public class FornEquipa {
	
	@Id
	private long id;	
	private String nomeitemservico;
	

	public String getNomeitemservico() {
		return nomeitemservico;
	}
	public void setNomeitemservico(String nomeitemservico) {
		this.nomeitemservico = nomeitemservico;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
