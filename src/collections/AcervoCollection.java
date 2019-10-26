package collections;

import java.util.ArrayList;
import gestaoDeAcervo.Acervo;

public class AcervoCollection {

	private static ArrayList<Acervo> acervo = new ArrayList<>();

	public void adicionarAcervo(Acervo a) {
		acervo.add(a);
	}

	public void procurarAcervo() {

	}

	public void removerAcervo() {

	}

	public static int getTamanho() {
		return acervo.size();
	}

	public static int ultimoCodigo() {
		int ultimoCodigo = acervo.get((getTamanho() - 1)).getCodigo();
		return ultimoCodigo;
	}
}
