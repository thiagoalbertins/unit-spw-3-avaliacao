package gestaoDeAcervo;

public class Revista extends Acervo {

	private int edicao;
	private String nomeRevista;

	Revista(int c, int aP, int nP, String v, int e, String nR) {
		super(c, aP, nP, v);
		this.edicao = e;
		this.nomeRevista = nR;
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
