package collections;
import java.util.ArrayList;
import gestaoDePessoa.Pessoa;
import interfaces.Crud;

public class PessoaCollection implements Crud {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	//Criar CRUD para a pessoa//
	
	public static void inserir(Pessoa p) {
		pessoas.add(p);
	}
	
	
	//Métodos de remoção
	
	public static void remover(int i, int tipo) {
		
		if (tipo==1) {
			pessoas.remove(i);
		} else if (tipo==2){
			
		}

	}
	
	//Métodos de consulta
	
	public static void listarNomeId() {
		
		for(int i = 0; i<tamanhoLista(); i++) {
			System.out.println("ID: " + pessoas.get(i).getId() + ", Nome: " + pessoas.get(i).getNome());
			
		}		
	}
	
	public static int tamanhoLista() {
		return pessoas.size();
	}
	
	public static int ultimoId() {
		
		int ultimoId = pessoas.get(tamanhoLista()-1).getId();
		
		return ultimoId;
	}
}
