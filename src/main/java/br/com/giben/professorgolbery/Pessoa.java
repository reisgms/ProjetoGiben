package br.com.giben.professorgolbery;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Table;

@Table
public class Pessoa {
	@Id
	private long pessoaid;
	private String observacao;
	
	
	public long getPessoaid() {
		return pessoaid;
	}
	public void setPessoaid(long pessoaid) {
		this.pessoaid = pessoaid;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
