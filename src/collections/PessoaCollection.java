package collections;

import java.util.ArrayList;
import gestaoDePessoa.Pessoa;
import interfaces.Crud;

public class PessoaCollection implements Crud {

	private static ArrayList<Pessoa> pessoas = new ArrayList<>();

	// Criar CRUD para a pessoa

	public static void inserir(Pessoa p) {
		pessoas.add(p);
	}

	// Métodos de remoção

	public static void remover(int id) {

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getId() == id) {
				pessoas.remove(i);
			} else {
				System.out.println("ID inválido!");
			}
		}
	}

	// Métodos de consulta

	public static void listarNomeId() {

		for (int i = 0; i < tamanhoLista(); i++) {
			System.out.println("ID: " + pessoas.get(i).getId() + ", Nome: " + pessoas.get(i).getNome()
					+ ", Tipo de pessoa: " + pessoas.get(i).getTipo());

		}
	}

	public static int tamanhoLista() {
		return pessoas.size();
	}

	public static int ultimoId() {

		if (pessoas.size() == 0) {
			return 0;
		} else {

			int ultimoId = pessoas.get(tamanhoLista() - 1).getId();

			return ultimoId;

		}

	}

	public static Pessoa buscaIndividual(int id) {

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getId() == id) {
				return pessoas.get(i);
			}
		}

		return null;

	}
}
