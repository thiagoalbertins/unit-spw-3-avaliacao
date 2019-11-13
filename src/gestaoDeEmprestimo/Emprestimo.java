package gestaoDeEmprestimo;

import java.time.*;
import gestaoDePessoa.Usuario;
import gestaoDeAcervo.Acervo;

public class Emprestimo {
	
	private Usuario usuario;
	private Acervo acervo;
	private String status;
	private LocalDate data;
	
	public Emprestimo(Usuario usuario, Acervo acervo, String status, LocalDate data) {
		super();
		this.usuario = usuario;
		this.acervo = acervo;
		this.status = status;
		this.data = LocalDate.now();
	}

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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void registrarEmprestimo() {//falta implementar
		
	}
}
