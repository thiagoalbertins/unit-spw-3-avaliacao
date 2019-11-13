package gestaoDeAcervo;

public class Jornal extends Acervo {

	private int edicao;
	private String nomeJornal;


	public Jornal(int anoPublicacao, int numeroPaginas, String volume, int edicao, String nomeJornal) {
		super(anoPublicacao, numeroPaginas, 1, volume);
		this.edicao = edicao;
		this.nomeJornal = nomeJornal;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getNomeJornal() {
		return nomeJornal;
	}

	public void setNomeJornal(String nomeJornal) {
		this.nomeJornal = nomeJornal;
	}
	
	public void listarTudo() {
		System.out.println(nomeJornal + ", "
				 + edicao + ", "
				 + getAnoPublicacao()  + ", "
				 + getNumeroPaginas()  + ", "
				 + getVolume() + ", ");
	}
	
}
