package root;
import interfaces.Input;

public class Main implements Input {

	public static void main(String[] args) {
		
		String opcao;
		String opcaoAnterior = "0";
		
		Menu.renderizar("0", opcaoAnterior);
		
		opcao = s.next();
		
		Menu.renderizar(opcao, opcaoAnterior);
		

	}

}
