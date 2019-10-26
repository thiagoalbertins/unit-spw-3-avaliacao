package root;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String opcao;
		
		Scanner s = new Scanner(System.in);
		
		Menu.menuInicial();
		
		opcao = s.next();
		
		Menu.renderizar(opcao);
		

	}

}
