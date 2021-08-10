package Turma29;

public class RacaCachorroPolimorfismo extends AnimalPOO1Polimorfismo{

	private String pedigree;

	public String getPedigree() {
		return pedigree;
	}

	public void setPedigree(String Pedigree) {
		this.pedigree = pedigree;
	}

	public String deveEmitirSom() {

		return "Golden Retriever" + super.getNome() + "!";
	}



}