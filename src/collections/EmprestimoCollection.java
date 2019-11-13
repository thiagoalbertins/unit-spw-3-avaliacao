package collections;

import java.util.ArrayList;
import java.util.List;

import gestaoDeEmprestimo.*;

public class EmprestimoCollection {

	private static List<Emprestimo> emprestimo = new ArrayList<>();

	public static void registrarEmprestimo(Emprestimo e) {
		emprestimo.add(e);
	}

	public static void listarEmprestimo() {
		for (int i = 0; i < emprestimo.size(); i++) {
			System.out.println(
					  " ||Usuário:" + emprestimo.get(i).getUsuario().getNome() 
					+ " ||Código do acervo: " + emprestimo.get(i).getAcervo().getCodigo() 
					+ " ||Data de emprestimo: " + emprestimo.get(i).getData() 
					+ " ||Status do emprestimo: " + emprestimo.get(i).getStatus());
		}
	}

	public static void devolução(Emprestimo a) {
		emprestimo.remove(a);
	}
}
