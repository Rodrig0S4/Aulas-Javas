package Turma29;

public class AnimalPOO {

	private String nome;
	private int idade;
	private boolean deveEmitirSom;
	
	
	public AnimalPOO (String nome, int idade, boolean deveEmitirSom) {
		
		super();
		this.nome = nome;
		this.idade = idade;
		this.deveEmitirSom = deveEmitirSom;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public boolean isDeveEmitirSom() {
		return deveEmitirSom;
	}


	public void setDeveEmitirSom(boolean deveEmitirSom) {
		this.deveEmitirSom = deveEmitirSom;
	}


	

}

	
	

