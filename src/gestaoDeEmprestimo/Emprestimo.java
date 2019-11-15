package gestaoDeEmprestimo;

import java.time.*;
import java.time.format.DateTimeFormatter;

import collections.EmprestimoCollection;
import gestaoDePessoa.Usuario;
import gestaoDeAcervo.Acervo;

public class Emprestimo {
	
	// Atributos
	private Usuario usuario;
	private Acervo acervo;
	private String status;
	private LocalDate dataFormat1 = LocalDate.now(); // formatação da data
	private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // formatação da data
	private String data = dataFormat1.format(formatoData); // data formatada
	
	// Construtor
	public Emprestimo(Usuario usuario, Acervo acervo, String status) {
		this.usuario = usuario;
		this.acervo = acervo;
		this.status = status;
	}

	
	// Getters and Setters
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Acervo getAcervo() {
		return acervo;
	}

	public void setAcervo(Acervo acervo) {
		this.acervo = acervo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
