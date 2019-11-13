package gestaoDeAcervo;

public class Revista extends Acervo implements interfaces.Input {

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
				 + " | Nome da revista: " + nomeRevista
				 + " | Edição: " + edicao
				 + " | Ano de publicação: " + getAnoPublicacao()
				 + " | Numero de páginas: " + getNumeroPaginas()
				 + " | Volume: " + getVolume());
	}
	
	public void atualizarDados(Revista r) {
		
		System.out.println("Ano de publicação: ");
		int anoPublicacao = s.nextInt();
		setAnoPublicacao(anoPublicacao);
		
		System.out.println("Número de páginas: ");
		int numeroPaginas = s.nextInt();
		setNumeroPaginas(numeroPaginas);
		
		System.out.println("Volume: ");
		String volume = s.next();
		setVolume(volume);		
		
		System.out.println("Número da edição: ");
		int edicao = s.nextInt();
		setEdicao(edicao);
		
		System.out.println("Nome da revista: ");
		String nomeRevista = s.next();
		setNomeRevista(nomeRevista);
		
	}

}
