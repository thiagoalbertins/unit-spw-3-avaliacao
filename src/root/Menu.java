package root;
import interfaces.Input;

public class Menu implements Input {
	
	//1-Menu inicial
	//2-Acervo
	//3-Pessoas
	
	int id;
	
	public static void renderizar(String menu, String opcaoAnterior) {
		
		switch(menu) {
		
		case "1": 
				menuInicial(opcaoAnterior);
				break;
				
		case "2": menuAcervo(opcaoAnterior);
				break;
		
		case "3": menuPessoas(opcaoAnterior);
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
