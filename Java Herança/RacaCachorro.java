package Turma29;

public class RacaCachorro extends AnimalPOO {
	
	private String pedigree;
	private boolean correr;
	
	
	public RacaCachorro (String nome, int idade, boolean deveEmitirSom, String pedigree, boolean correr) {
		
		super (nome, idade, deveEmitirSom);
		this.pedigree = pedigree;
		this.correr = correr;
	}


	public String getPedigree() {
		return pedigree;
	}


	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}


	public boolean isCorrer() {
		return correr;
	}


	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	public void imprimirinfo() {
		System.out.println("\nNome "+getNome()+"\nIdade "+getIdade()+"\nEmitir Som "+isDeveEmitirSom()+"\nPedigree "+pedigree+"\nCachorro(a) "+correr);
	}
	
}  
	