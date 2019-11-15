package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gestaoDeEmprestimo.*;

public class EmprestimoCollection {

	private static List<Emprestimo> emprestimos = new ArrayList<>();

	public static void registrarEmprestimo(Emprestimo e) {
		emprestimos.add(e);
	}

	public static void listarEmprestimo() {
		for (int i = 0; i < emprestimos.size(); i++) {
			System.out.println(i +
					  " || Usuário:" + emprestimos.get(i).getUsuario().getNome() 
					+ " || Código do acervo: " + emprestimos.get(i).getAcervo().getCodigo() 
					+ " || Data do emprestimo: " + emprestimos.get(i).getSdf().format(emprestimos.get(i).getData()) 
					+ " || Data de Devolução: " + emprestimos.get(i).getSdf().format(emprestimos.get(i).getDataParaDevolucao())
					+ " || Status: " + emprestimos.get(i).getStatus());

		}
	}

	public static void devolucao(Emprestimo e) {
		emprestimos.remove(e);
	}
	
	public static int tamanhoLista() {
		return emprestimos.size();
	}
	
	public static Emprestimo buscarEmprestimo(int i) {	
		return emprestimos.get(i);
	}
}
