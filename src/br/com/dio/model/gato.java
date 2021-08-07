package br.com.dio.model;

import java.util.Objects;

public class gato {

	private String nome;
	private string cor;
	private Integer idade;
	public gato() {}
	
	public gato(String nome, string cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public string getCor() {
		return cor;
	}

	public void setCor(string cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		gato other = (gato) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	
	
	
	/* public gato (String nome, String cor, String idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/
	
	
}
