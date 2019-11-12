package gestaoDeAcervo;

import collections.AcervoCollection;

public class Jornal extends Acervo {

	private String nomeJornal;

	public Jornal(int anoPublicacao, int numeroPaginas, String volume, String nomeJornal) {
		super(anoPublicacao, numeroPaginas, 1, volume);
		this.nomeJornal = nomeJornal;
		setCodigo(AcervoCollection.ultimoCodigo() + 1); //necessita verificação
	}

	public String getNomeJornal() {
		return nomeJornal;
	}

	public void setNomeJornal(String nomeJornal) {
		this.nomeJornal = nomeJornal;
	}
}
