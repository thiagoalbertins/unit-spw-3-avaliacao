package gestaoDeAcervo;

public class Jornal extends Acervo implements interfaces.Input {

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
		System.out.println("Código: " + getCodigo()
				 + " | Nome do jornal: " + nomeJornal + ", "
				 + " | Ano de publicação: " + getAnoPublicacao()  + ", "
				 + " | Número de páginas: " + getNumeroPaginas()  + ", "
				 + " | Volume: " + getVolume() + ", ");
	}
	
	public void atualizarDados(Jornal j) {
		
		System.out.println("Ano de publicação: ");
		int anoPublicacao = s.nextInt();
		setAnoPublicacao(anoPublicacao);
		
		System.out.println("Número de páginas: ");
		int numeroPaginas = s.nextInt();
		setNumeroPaginas(numeroPaginas);
		
		System.out.println("Volume: ");
		String volume = s.next();
		setVolume(volume);
				
		System.out.println("Nome do jornal: ");
		String nomeJornal = s.next();
		setNomeJornal(nomeJornal);		
		
	}
	
	
}
