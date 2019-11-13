package collections;

import java.util.ArrayList;
import java.util.List;

import gestaoDeAcervo.Acervo;
import gestaoDeAcervo.Jornal;
import gestaoDeAcervo.Livro;
import gestaoDeAcervo.Revista;

public class AcervoCollection {

	private static List<Acervo> acervo = new ArrayList<>();

	public static void adicionarAcervo(Acervo a) {
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

		for (int i = 0; i < acervo.size(); i++) {
			if (tipo == 0) {
				System.out.println(acervo.get(i).getTipo());
			} else {
				if (acervo.get(i).getTipo() == tipo) {
					selecionador(tipo, i);
				}
			}
		}
	}
	
	private static void selecionador(int tipo, int i) {
		
		switch(tipo) {		
		case 1:
			((Jornal) acervo.get(i)).listarTudo();
			break;
			
		case 2:
			((Livro) acervo.get(i)).listarTudo();
			break;
			
		case 3:
			((Revista) acervo.get(i)).listarTudo();
			break;
		}	
		
	}
	
	
}
