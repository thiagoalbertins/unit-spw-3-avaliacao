package root;
import collections.AcervoCollection;
import gestaoDeAcervo.Jornal;
import interfaces.Input;
import utils.Utils;

public class Menu implements Input {
	
//Estrutura de menus (códigos)
	//0-Menu inicial
	//1-Acervo
		//1-1 Cadastro no acervo
		//1-2 Listar do acervo
		//1-3 Atualizar acervo
		//1-4 Deletar do acervo
	//2-Pessoas
		//2-1 Cadastro pessoas
		//2-2 Listar pessoas
		//2-3 Atualizar pessoas
		//2-4 Deletar pessoas
	
	
	//Render -> Método público responsável por renderizar os menus
	
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
	
	//Início
	
	private static void menuInicial(String opcaoAnterior) {
		
		String opcao;
		
		System.out.println("Sistema Biblioteca \n\n\n"+
						"\n 1 - Acervo"+
						"\n 2 - Pessoas"
				);
		
		opcao = s.next();
		
		renderizar(opcao, opcaoAnterior);
		
	}
	
	
	//Acervo
	
	private static void menuAcervo(String opcaoAnterior) {
				
		System.out.println("Menu Acervo \n\n\n"+
						"\n 1 - Cadastrar"+
						"\n 2 - Listar"+
						"\n 3 - Atualizar"+
						"\n 4 - Remover"+
						"\n\n [v] - Voltar"
				);
		
		String opcao = s.next();
		
		switch(opcao) {
		
		case "1":
				
				System.out.println("Escolha o que cadastrar:"
						+ "\n 1 - Jornal"
						+ "\n 2 - Livro"
						+ "\n 3 - Revista");
				
				String opcaoCadastro = s.next();
				
				switch(opcaoCadastro) {
				
				case "1":
					
					System.out.println("Ano de publicação: ");
					int anoPublicacao = s.nextInt();
					System.out.println("Número de páginas: ");
					int numeroPaginas = s.nextInt();
					System.out.println("Volume: ");
					String volume = s.next();
					System.out.println("Número da edição: ");
					int edicao = s.nextInt();
					System.out.println("Nome do jornal: ");
					String nomeJornal = s.next();
					
					Jornal j  = new Jornal(anoPublicacao, numeroPaginas, volume, edicao, nomeJornal);
					
					AcervoCollection.adicionarAcervo(j);
					
					Menu.renderizar("1", opcaoAnterior);
					
					break;
					
				case "2":
					
					System.out.println("Codigo do livro: ");
					int codigo = s.nextInt();
					System.out.println("Número de páginas: ");
					int numeroPaginas = s.nextInt();
					System.out.println("Volume: ");
					String volume = s.next();
					System.out.println("Número da edição: ");
					int edicao = s.nextInt();
					System.out.println("Nome do jornal: ");
					String nomeJornal = s.next();
					
					Jornal j  = new Jornal(anoPublicacao, numeroPaginas, volume, edicao, nomeJornal);
					
					AcervoCollection.adicionarAcervo(j);
					
					Menu.renderizar("1", opcaoAnterior);
					
				case "3":
					
					System.out.println("Ano de publicação: ");
					int anoPublicacao = s.nextInt();
					System.out.println("Número de páginas: ");
					int numeroPaginas = s.nextInt();
					System.out.println("Volume: ");
					String volume = s.next();
					System.out.println("Número da edição: ");
					int edicao = s.nextInt();
					System.out.println("Nome do jornal: ");
					String nomeJornal = s.next();
					
					Jornal j  = new Jornal(anoPublicacao, numeroPaginas, volume, edicao, nomeJornal);
					
					AcervoCollection.adicionarAcervo(j);
					
					Menu.renderizar("1", opcaoAnterior);
					
				}
				
				
		
		case "v":
				
				if(opcaoAnterior=="0") {
					opcao="0";
				}
			
				renderizar(opcao, opcaoAnterior);
				break;
					
		}
		
	}
	
	//Pessoas
	
	private static void menuPessoas(String opcaoAnterior) {
		
		System.out.println("Menu Pessoas \n\n\n"+
						"\n 1 - Cadastrar"+
						"\n 2 - Listar"+
						"\n 3 - Atualizar"+
						"\n 4 - Remover"+
						"\n\n [v] - Voltar"
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
	
	private static void menuCadastroPessoas(String opcaoAnterior) {
		
		System.out.println("Cadastro de pessoas \n\n\n" + 
						"Escolha o tipo de pessoa: " +
						"\n 1 - Antendente" +
						"\n 2 - Usuário"+
						"\n\n [v] - Voltar"
				);
		
		String opcao = s.next();
		
		switch(opcao) {
		
		case "1":
			
			
		
		case "v":
			
			if(opcaoAnterior=="0") {
				opcao="0";
			}
			renderizar(opcao, opcaoAnterior);
			break;		
			
		}
			
	}
	
}
	

