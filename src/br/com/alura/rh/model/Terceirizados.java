package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizados {

	private DadosPessoais dadosPessoais;
	private String empresa;

	public Terceirizados(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}