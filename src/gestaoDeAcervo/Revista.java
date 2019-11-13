package gestaoDeAcervo;

public class Revista extends Acervo {

	private int edicao;
	private String nomeRevista;

	public Revista(int anoPublicacao, int numeroPaginas, String volume, int edicao, String nomeRevista) {
		super(anoPublicacao, numeroPaginas, 3, volume);
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
	
	public void listarTudo() {
		System.out.println("Código: " + getCodigo()
				 + "Nome da revista: " + nomeRevista + ", "
				 + "Edição: " + edicao + ", "
				 + "Ano de publicação: " + getAnoPublicacao()  + ", "
				 + "Numero de páginas: " + getNumeroPaginas()  + ", "
				 + "Volume: " + getVolume() + ", ");
	}
	
	public void atualizarDados() {
		
	}

}
