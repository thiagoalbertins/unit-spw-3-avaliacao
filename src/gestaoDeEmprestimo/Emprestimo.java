package gestaoDeEmprestimo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import gestaoDePessoa.Usuario;
import gestaoDeAcervo.Acervo;

public class Emprestimo {
	
	// Atributos
	private Usuario usuario;
	private Acervo acervo;
	private String status;
	@SuppressWarnings("unused")
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date data = new Date();
	private Calendar cal = Calendar.getInstance();
//	private String data = sdf.format(hoje);
	private Date dataParaDevolucao;
	private Date dataDevolvido;
	
	// Construtor
	public Emprestimo(Usuario usuario, Acervo acervo, String status) {
		this.usuario = usuario;
		this.acervo = acervo;
		this.status = status;
		cal.setTime(data);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		this.dataParaDevolucao = cal.getTime();
	}

	// Getters and Setters
	
	public Date getDataParaDevolucao() {
		return dataParaDevolucao;
	}


	public void setDataParaDevolucao(Date dataParaDevolucao) {
		this.dataParaDevolucao = dataParaDevolucao;
	}


	public Date getDataDevolvido() {
		return dataDevolvido;
	}


	public void setDataDevolvido(Date dataDevolvido) {
		this.dataDevolvido = dataDevolvido;
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

	// Métodos
	public void registrarEmprestimo() {//falta implementar
		
	}
}
