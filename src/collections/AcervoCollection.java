package collections;

import java.util.ArrayList;
import gestaoDeAcervo.Acervo;

public class AcervoCollection {

	private static ArrayList<Acervo> acervo = new ArrayList<>();

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
					System.out.println(acervo.get(i).getTipo());
				}
			}
		}
	}
}
