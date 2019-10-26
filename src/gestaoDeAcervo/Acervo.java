package gestaoDeAcervo;

public class Acervo {

	int codigo, anoPublicacao, numeroPaginas;
	String volume;

	Acervo(int c, int aP, int nP, String v) {
		this.codigo = c;
		this.anoPublicacao = aP;
		this.numeroPaginas = nP;
		this.volume = v;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

}
