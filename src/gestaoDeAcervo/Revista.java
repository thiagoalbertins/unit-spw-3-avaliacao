package gestaoDeAcervo;

import collections.AcervoCollection;

public class Revista extends Acervo {

	private int edicao;
	private String nomeRevista;

	public Revista(int anoPublicacao, int numeroPaginas, String volume, int edicao, String nomeRevista) {
		super(anoPublicacao, numeroPaginas, 3, volume);
		this.edicao = edicao;
		this.nomeRevista = nomeRevista;
		setCodigo(AcervoCollection.ultimoCodigo() + 1); //verificar
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
