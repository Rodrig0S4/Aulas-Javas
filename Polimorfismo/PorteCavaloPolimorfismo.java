package Turma29;

public class PorteCavaloPolimorfismo extends AnimalPOO1Polimorfismo {

	private String mangaLarga;

	public String getmangaLarga() {
		return mangaLarga;
	}

	public void setmangaLarga(String mangaLarga) {
		this.mangaLarga = mangaLarga;
	}


	public String deveEmitirSom() {

		return " Égua " + super.getNome() + "!";
	}



}
