package gestaoDePessoa;

import collections.PessoaCollection;

public abstract class Pessoa {
	
	private String nome, cpf, fone, endereco, cep, email;
	int id, tipo;
	//Emprestimo listaEmprestimos;
	
	//Construtor
	
	public Pessoa(String nome, String cpf, String fone, String endereco, String cep, String email, int tipo) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;
		this.cep = cep;
		this.email = email;
		this.id = PessoaCollection.ultimoId()+1;
	}
	
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
