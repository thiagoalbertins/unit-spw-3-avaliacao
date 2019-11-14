package gestaoDePessoa;

public class Usuario extends Pessoa {
	
	private String matricula, curso;

	public Usuario(String nome, String cpf, String fone, String endereco, String cep, String email, int tipo,
			String matricula, String curso) {
		super(nome, cpf, fone, endereco, cep, email, 2);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
