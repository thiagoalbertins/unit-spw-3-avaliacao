package collections;

import java.util.ArrayList;
import java.util.Calendar;
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
			System.out.println(i + " || Usuário:" + emprestimos.get(i).getUsuario().getNome() + " || Código do acervo: "
					+ emprestimos.get(i).getAcervo().getCodigo() + " || Data do emprestimo: "
					+ emprestimos.get(i).getSdf().format(emprestimos.get(i).getData()) + " || Data de Devolução: "
					+ emprestimos.get(i).getSdf().format(emprestimos.get(i).getDataParaDevolucao()) + " || Status: "
					+ emprestimos.get(i).getStatus());

		}
	}

	public static void devolucao(Emprestimo e) {

		Date devolucao = new Date();
		e.setDataDevolvido(devolucao);
		Calendar a = Calendar.getInstance();
		a.setTime(devolucao);// data devolvido

		Calendar b = Calendar.getInstance();
		b.setTime(e.getDataParaDevolucao());// data para devolucao

		int numeroDias = 0;
		
		if (b.getTimeInMillis() < a.getTimeInMillis()) {
			
			a.add(Calendar.DATE, -b.get(Calendar.DAY_OF_MONTH));
			numeroDias = a.get(Calendar.DAY_OF_MONTH);
				
		} else if (b.getTimeInMillis() > a.getTimeInMillis()) {
			
			b.add(Calendar.DATE, -a.get(Calendar.DAY_OF_MONTH));
			numeroDias = b.get(Calendar.DAY_OF_MONTH);
		}

		e.setMulta(numeroDias * e.getMultaPorDia());
		if (numeroDias > 7) {
			System.out.printf("Devolvido com sucesso!%nMulta a ser paga: R$ %.2f", e.getMulta());
		} else if (numeroDias <= 7) {
			if (e.getAcervo().getTipo() == 1) {
				System.out.println("Jornal devolvido com sucesso! Sem multa a pagar!");
			} else if (e.getAcervo().getTipo() == 2) {
				System.out.println("Livro devolvido com sucesso! Sem multa a pagar!");
			} else if (e.getAcervo().getTipo() == 3) {
				System.out.println("Revista devolvida com sucesso! Sem multa a pagar!");
			}

		}

		emprestimos.remove(e);
	}

	public static int tamanhoLista() {
		return emprestimos.size();
	}

	public static Emprestimo buscarEmprestimo(int i) {
		return emprestimos.get(i);
	}
}
