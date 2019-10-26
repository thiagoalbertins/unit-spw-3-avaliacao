package root;

public class Menu {
	
	//1-Menu inicial
	//2-Acervo
	//3-Pessoas
	
	int id;
	
	public static void renderizar(String i) {
		
		switch(i) {
		
		case "1": menuInicial();
				break;
				
		case "2": menuAcervo();
				break;
		
		case "3": menuPessoas();
				break;
				
		}
		
	}
	
	
	public static void menuInicial() {
		
		System.out.println("Sistema Biblioteca \n"+
						"\n 1 - Acervo"+
						"\n 2 - Pessoas"
				);
	}
	
	public static void menuAcervo() {
		
		System.out.println("Menu Acervo \n"+
						"\n [v] - Voltar"
				);
		
	}
	
	public static void menuPessoas() {
		
		System.out.println("Menu Pessoas \n"+
						"\n [v] - Voltar"
				);
		
	}
	

}
