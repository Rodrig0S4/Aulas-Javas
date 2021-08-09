package Turma29;

public class PorteCavalo extends AnimalPOO{

	private String mangaLarga;
	private boolean correr;

	public PorteCavalo (String nome, int idade, boolean deveEmitirSom, String mangaLarga, boolean correr) {
		
		super (nome, idade, deveEmitirSom);
		this.correr = correr;
		this.mangaLarga= mangaLarga;
	}

	public String getMangaLarga() {
		return mangaLarga;
	}

	public void setMangaLarga(String mangaLarga) {
		this.mangaLarga = mangaLarga;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	public void imprimirinfo() {
		System.out.println("\nNome "+getNome()+"\nIdade "+getIdade()+"\nEmitir Som "+isDeveEmitirSom()+"\nFemea "+mangaLarga+"\nRápida "+correr);
	}
	
}