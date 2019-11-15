package collections;

import java.util.ArrayList;
import java.util.List;

import gestaoDeEmprestimo.*;

public class EmprestimoCollection {

	private static List<Emprestimo> emprestimos = new ArrayList<>();

	public static void registrarEmprestimo(Emprestimo e) {
		emprestimos.add(e);
	}

	public static void listarEmprestimo() {
		for (int i = 0; i < emprestimos.size(); i++) {
			System.out.println(
					  " ||Usuário:" + emprestimos.get(i).getUsuario().getNome() 
					+ " ||Código do acervo: " + emprestimos.get(i).getAcervo().getCodigo() 
					+ " ||Data de emprestimos: " + emprestimos.get(i).getData() 
					+ " ||Status do emprestimos: " + emprestimos.get(i).getStatus());
		}
	}

	public static void devolução(Emprestimo a) {
		emprestimos.remove(a);
	}
	
	public static int tamanhoLista() {
		return emprestimos.size();
	}

}
