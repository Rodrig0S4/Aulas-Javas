package Turma29;

import java.util.Set;

public class TesteAnimalPOOPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			RacaCachorroPolimorfismo golden = new RacaCachorroPolimorfismo();
			golden.setPedigree("Golden Retriever");
			golden.setdeveEmitirSom("Latir e rosnar");
			
			PorteCavaloPolimorfismo mangaLarga = new PorteCavaloPolimorfismo();
			mangaLarga.setmangaLarga("Manga Larga - Sabrina");
			mangaLarga.setdeveEmitirSom("Trota e Relicha");
			
			EspeciePreguiça Sid = new EspeciePreguiça();
			Sid.setSobeemArvore(true);
			Sid.setDeveEmitirSom("Animal não reproduz som");
			
			AnimalPOO1Polimorfismo[] animal = new AnimalPOO1Polimorfismo[3];
					animal[0] = golden;
					animal[1] = mangaLarga;
					animal[2] = sobeemArvore; 
					
					for(AnimalPOO1Polimorfismo animais:animal) {
						
						System.out.println(animais.getdeveEmitirSom());
					}
			
			
	}	
		
		
	

}
