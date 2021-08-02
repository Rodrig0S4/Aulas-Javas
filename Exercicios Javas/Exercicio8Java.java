//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
//consumidor.

package Turma29;

import java.util.Scanner;

public class Exercicio8Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double custof,custoc, porcentagemfabricante;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o custo de fábrica do carro: ");
		custof = leia.nextDouble();
		
		custoc = custof+ (custof*0.73);
		System.out.printf("%.2f",custoc);
		
	}

}
