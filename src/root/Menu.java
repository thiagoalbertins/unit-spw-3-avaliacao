package root;

import java.util.Scanner;

public class Menu {
	
	//1-Menu inicial
	//2-Acervo
	//3-Pessoas
	
	int id;
	
	public static void renderizar(String i) {
		
		String opcaoAnterior;
		
		switch(i) {
		
		case "1": 
				opcaoAnterior = i;
				menuInicial();
				break;
				
		case "2": menuAcervo();
				break;
		
		case "3": menuPessoas();
				break;
				
		}
		
	}
	
	
	public static void menuInicial(String opcaoAnterior) {
		
		System.out.println("Sistema Biblioteca \n"+
						"\n 1 - Acervo"+
						"\n 2 - Pessoas"
				);
	}
	
	public static void menuAcervo(String opcaoAnterior, Scanner s) {
		
		//Limpar tela
		
		String opcao = s.next();
		
		System.out.println("Menu Acervo \n"+
						"\n 1 - Cadastrar"+
						"\n 2 - Listar"+
						"\n 3 - Atualizar"+
						"\n 4 - Remover"+
						"\n [v] - Voltar"
				);
		
		switch(opcao) {
		
		case "1":
				
		
		
		}
		
	}
	
	public static void menuPessoas(String opcaoAnterior) {
		
		System.out.println("Menu Pessoas \n"+
						"\n [v] - Voltar"
				);
		
		
	}
	

}
