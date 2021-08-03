//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.


package Turma29;

import java.util.Scanner;

public class ExLacoDecisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; 
		double a, b;
		try(Scanner leia = new Scanner(System.in)) {
			
		System.out.println("\nEntre com qualquer número: ");
		numero = leia.nextInt();
		
		if(numero %2==0){
		a=Math.sqrt(numero);
		System.out.println("\nSe é número par:"+numero+" raiz dele = "+a);
		}
		
		else {
		b=Math.pow(numero, 2);
		System.out.println("\nSe é número ímpar:"+numero+" pontencia dele = "+b);
		}
		
		}
	}

}
