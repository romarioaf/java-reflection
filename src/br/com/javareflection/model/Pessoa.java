package br.com.javareflection.model;

public class Pessoa {

	private String nome;
	private Integer idade;

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void testPessoa() {
		System.out.println("testando...");
	}
	
}
