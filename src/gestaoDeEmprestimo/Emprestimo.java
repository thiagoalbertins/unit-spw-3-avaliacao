package gestaoDeEmprestimo;

import java.util.Date;
import gestaoDePessoa.Usuario;
import gestaoDeAcervo.Acervo;

public class Emprestimo {
	
	private Usuario usuario;
	private Acervo acervo;
	private String status;
	private Date data;
	
	public Emprestimo(Usuario usuario, Acervo acervo, String status, Date data) {
		super();
		this.usuario = usuario;
		this.acervo = acervo;
		this.status = status;
		this.data = data;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void registrarEmprestimo() {//falta implementar
		
	}
}
