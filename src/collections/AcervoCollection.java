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
	
	public static void listarAcervo() {
		
		for (int i=0 ; i < acervo.size() ; i++) {
			
			if (acervo.get(i).getTipo() == 1) { // falta modifica��o
			
				System.out.println("Acervo Cadastrado:/n" + acervo.get(i).getCodigo() + " - Cliente: " + listaTodosPedidos.get(i).cliente + " || "
					+ listaTodosPedidos.get(i).bebida.descricao + ", " + listaTodosPedidos.get(i).entrada.descricao
					+ ", " + listaTodosPedidos.get(i).prato_principal.descricao + " e "
					+ listaTodosPedidos.get(i).sobremesa.descricao + "|| Valor total R$" + listaTodosPedidos.get(i).valor));	
			}
			else if( acervo.get(i).getTipo() == 2) {
				
			}
			
			else if(acervo.get(i).getTipo() == 3) {
				
			}
			else
			
		}
	}
}
