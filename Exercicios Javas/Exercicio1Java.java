//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.

package Turma29;

import java.util.Scanner;

public class Exercicio1Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Qual a sua idade: ");
		idade = leia.nextInt();
		dias = idade * 365;
		System.out.println("\nSua idade em dias é: " +dias);
		
		
		
	}

}
