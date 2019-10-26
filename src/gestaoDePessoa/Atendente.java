package gestaoDePessoa;

public class Atendente extends Pessoa {
	
	private int identificador;
	
	public Atendente(String nome, String cpf, String fone, String endereco, String cep, String email, int identificador) {
		super(nome, cpf, fone, endereco, cep, email);
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
}
