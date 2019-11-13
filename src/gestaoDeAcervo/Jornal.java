package gestaoDeAcervo;

public class Jornal extends Acervo {

	private String nomeJornal;


	public Jornal(int anoPublicacao, int numeroPaginas, String volume, String nomeJornal) {
		super(anoPublicacao, numeroPaginas, 1, volume);
		this.nomeJornal = nomeJornal;
	}

	public String getNomeJornal() {
		return nomeJornal;
	}

	public void setNomeJornal(String nomeJornal) {
		this.nomeJornal = nomeJornal;
	}
	
	public void listarTudo() {
		System.out.println("Nome do jornal: " + nomeJornal + ", "
				 + "Ano de publicação: " + getAnoPublicacao()  + ", "
				 + "Número de páginas: " + getNumeroPaginas()  + ", "
				 + "Volume: " + getVolume() + ", ");
	}
	
}
