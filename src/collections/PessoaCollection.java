package collections;

import java.util.ArrayList;

import gestaoDePessoa.Pessoa;

public class PessoaCollection {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	//Criar CRUD para a pessoa
	
	public static void inserir(Pessoa p) {
		pessoas.add(p);
	}
	
	
	//Métodos de remoção
	
	//Remove pelo índice do objeto na lista
	public static void remover(int indice) {
		pessoas.remove(indice);
	}
	
	//Remove pelo id de cadastro do objeto
	public static void remover(int id) {
		
		
		
	}
	
	
	//Métodos de consulta
	
	public static int tamanhoLista() {
		return pessoas.size();
	}

}
