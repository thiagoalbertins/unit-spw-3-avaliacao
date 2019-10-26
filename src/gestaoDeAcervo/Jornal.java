package gestaoDeAcervo;

public class Jornal extends Acervo {

	private int edicao;
	private String nomeRevista;

	public Jornal(int codigo, int anoPublicacao, int numeroPaginas, int tipo, String volume, int edicao,
			String nomeRevista) {
		super(codigo, anoPublicacao, numeroPaginas, tipo, volume);
		this.edicao = edicao;
		this.nomeRevista = nomeRevista;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getNomeRevista() {
		return nomeRevista;
	}

	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}
}