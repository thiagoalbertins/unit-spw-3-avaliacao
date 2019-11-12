package collections;

import java.util.ArrayList;
import gestaoDeAcervo.*;

public class AcervoCollection {

	private static ArrayList<Acervo> acervo = new ArrayList<Acervo>();
	private static ArrayList<Jornal> jornal = new ArrayList<Jornal>();
	private static ArrayList<Livro> livro = new ArrayList<Livro>();
	private static ArrayList<Revista> revista = new ArrayList<Revista>();

	public static void adicionarAcervo(Acervo a) { // colocar if para cada tipo de acervo(jornal, livro e revista
		acervo.add(a);
	}

	public void procurarAcervo() {

	}

	public void removerAcervo() {

	}

	public static int getTamanhoAcervo() {
		return acervo.size();
	}

	public static int ultimoCodigo() {
		if (acervo.size() == 0) {
			return 0;
		} else {

			int ultimoCodigo = acervo.get((getTamanhoAcervo() - 1)).getCodigo();
			return ultimoCodigo;
		}
	}

	public static void listarAcervo(int tipo) {

		for (int i = 0; i < acervo.size(); i++) { // verificar possibilidade de colocar todos atributos de Livro, Jornal e Revista na classe Acervo
			                                      // ou instanciar um ArrayList de Jornal, um ArrayList de Livro e um ArrayList de Revista
			                                      // e listar um por vez. Porém ao invés de salvar todo acervo numa ArrayList só teira que ser três.
			if (tipo == 0) {
				if (acervo.get(i).getTipo() == 1) { // jornal

					System.out.println("Acervo Cadastrado:/n" + jornal.get(i).getCodigo() 
							+ " || Ano de Publicação: "+ jornal.get(i).getAnoPublicacao()
							+ " || Número de páginas: "+ jornal.get(i).getNumeroPaginas() 
							+ " || Volume: " + jornal.get(i).getVolume()
							+ " || Nome do Jornal: " + jornal.get(i).getNomeJornal());
				} else if (acervo.get(i).getTipo() == 2) {// livro

					System.out.println("Acervo Cadastrado:/n" + livro.get(i).getCodigo()
							+ " || Ano de Publicação: "+ livro.get(i).getAnoPublicacao()
							+ " || Número de páginas: "+ livro.get(i).getNumeroPaginas()
							+ " || Volume: " + livro.get(i).getVolume()
							+ " || Código do Autor: " + livro.get(i).getCodigoAutor() 
							+ " || Nome do Jornal: "+ livro.get(i).getEdicao() 
							+ " || Nome do Jornal: " + livro.get(i).getEditora()
							+ " || Nome do Jornal: " + livro.get(i).getIsbn() 
							+ " || Nome do Jornal: "+ livro.get(i).getNomeAutor() 
							+ " || Nome do Jornal: " + livro.get(i).getTitulo());
				}

				else if (acervo.get(i).getTipo() == 3) {// revista

				} else {
					System.out.println("Tipo inválido");
				}

			} else {
				if (acervo.get(i).getTipo() == tipo) {
					System.out.println(acervo.get(i).getTipo());
				}
			}
		}
	}
}
