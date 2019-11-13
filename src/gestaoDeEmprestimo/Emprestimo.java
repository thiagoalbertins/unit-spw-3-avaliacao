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

	public void registrarEmprestimo() {
		
	}
}
