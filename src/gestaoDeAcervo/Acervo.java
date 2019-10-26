package gestaoDeAcervo;
import collections.AcervoCollection;

public abstract class Acervo {

	private int codigo, anoPublicacao, numeroPaginas, tipo;
	private String volume;

	public Acervo(int anoPublicacao, int numeroPaginas, int tipo, String volume) {
		this.anoPublicacao = anoPublicacao;
		this.numeroPaginas = numeroPaginas;
		this.tipo = tipo;
		this.volume = volume;
		this.codigo = AcervoCollection.ultimoCodigo() + 1;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}


}
