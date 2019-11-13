package gestaoDeAcervo;

public class Livro extends Acervo implements interfaces.Input {

	private int codigoAutor, edicao;
	private String nomeAutor, titulo, editora, isbn;

	public Livro(int anoPublicacao, int numeroPaginas, String volume, int codigoAutor, int edicao, String nomeAutor, String titulo, String editora, String isbn) {
		super(anoPublicacao, numeroPaginas, 2, volume);
		
		this.codigoAutor = codigoAutor;
		this.edicao = edicao;
		this.nomeAutor = nomeAutor;
		this.titulo = titulo;
		this.editora = editora;
		this.isbn = isbn;
		
	}

	public int getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void listarTudo() {
		System.out.println("Código: " + getCodigo()
				 + "Nome do autor: " +  nomeAutor + ", "
				 + "Titulo: " + titulo  + ", "
				 + "Editora: " + editora + ", "
				 + "Edição: " + edicao + ", "
				 + "Ano de publicação: " + getAnoPublicacao()  + ", "
				 + "Número de páginas: " + getNumeroPaginas()  + ", "
				 + "Volume: " + getVolume() + ", ");
		
	}
	
	public void atualizarDados(Livro l) {
		
		System.out.println("Ano de publicação do livro: ");
		int anoPublicacao = s.nextInt();
		setAnoPublicacao(anoPublicacao);
		
		System.out.println("Número de páginas: ");
		int numeroPaginas = s.nextInt();
		setNumeroPaginas(numeroPaginas);
		
		System.out.println("Volume: ");
		String volume = s.next();
		setVolume(volume);
		
		System.out.println("Código do autor: ");
		int codigoAutor = s.nextInt();
		setCodigoAutor(codigoAutor);		
		
		System.out.println("Nome do autor: ");
		String nomeAutor = s.next();
		setNomeAutor(nomeAutor);

		System.out.println("Edição: ");
		int edicao = s.nextInt();
		setEdicao(edicao);
		
		System.out.println("Titulo do livro: ");
		String titulo = s.next();
		setTitulo(titulo);
		
		System.out.println("Editora: ");
		String editora = s.next();
		setEditora(editora);
		
		System.out.println("ISBN: ");
		String isbn = s.next();
		setIsbn(isbn);
			
	}
		
}
