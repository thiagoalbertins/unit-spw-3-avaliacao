package root;
import interfaces.Input;
import utils.Utils;

public class Menu implements Input {
	
	//1-Menu inicial
	//2-Acervo
	//3-Pessoas
	
	int id;
	
	public static void renderizar(String menu, String opcaoAnterior) {
		
		switch(menu) {
		
		case "0": 
				Utils.limparTela();
				menuInicial(opcaoAnterior);
				break;
				
		case "1": 
			    Utils.limparTela();
				menuAcervo(opcaoAnterior);
				break;
		
		case "2": 
				Utils.limparTela();
				menuPessoas(opcaoAnterior);
				break;
				
		}
		
	}
	
	public static void menuInicial(String opcaoAnterior) {
		
		System.out.println("Sistema Biblioteca \n"+
						"\n 1 - Acervo"+
						"\n 2 - Pessoas"
				);
	}
	
	public static void menuAcervo(String opcaoAnterior) {
		
		//Limpar tela
		
		
		
		System.out.println("Menu Acervo \n"+
						"\n 1 - Cadastrar"+
						"\n 2 - Listar"+
						"\n 3 - Atualizar"+
						"\n 4 - Remover"+
						"\n [v] - Voltar"
				);
		
		String opcao = s.next();
		
		switch(opcao) {
		
		case "v":
				
				if(opcaoAnterior=="0") {
					opcao="0";
				}
			
				renderizar(opcao, opcaoAnterior);
				break;
					
		}
		
	}
	
	public static void menuPessoas(String opcaoAnterior) {
		
		System.out.println("Menu Pessoas \n"+
						"\n [v] - Voltar"
				);
		
		String opcao = s.next();
		
		switch(opcao) {
		
		case "v":
				
				if(opcaoAnterior=="0") {
					opcao="0";
				}
			
				renderizar(opcao, opcaoAnterior);
				break;
					
		}
		
		
	}
	

}
