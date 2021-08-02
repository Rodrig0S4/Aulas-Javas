//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.

package Turma29;

import java.util.Scanner;

public class Exercicio2JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int td, anos, meses, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o total de dias: ");
		td = leia.nextInt();
		
		anos = td / 365;
		meses = (td % 365) / 30;
		dias = (td % 365) % 30;
		
		System.out.println("\n Você viveu: "+anos+" ano(s) e " +meses+ "mes(es) "+dias+" dia(s) de vida");
		
		
	}

}
