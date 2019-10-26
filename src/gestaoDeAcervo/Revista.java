package gestaoDeAcervo;

public class Revista extends Acervo {

	private int edicao;
	private String nomeRevista;

	public Revista(int codigo, int anoPublicacao, int numeroPaginas, int tipo, String volume, int edicao,
			String nomeRevista) {
		super(codigo, anoPublicacao, numeroPaginas, volume);
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
