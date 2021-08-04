//3 -Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)

package Turma29;

import java.util.Scanner;

public class ExRepWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int idade,idade21=0,idade50=0;
		System.out.println("\nDIGITE A IDADE: ");
		idade = leia.nextInt();
		 
		 while(idade!=-99)
		 {
			 
		 if (idade<=21)
		 {
			 idade21++;
		 }
		 else if (idade>=50)
		 {	 
			 idade50++;
		 }
		 else {
		System.out.println("\nIDADE FORA DO ESCOPO ");
		 }
		 
		System.out.println("\nENTRE COM A IDADE");
		idade = leia.nextInt();
		
		 }
		 
		 System.out.println("\nQUANTIDADE DE PESSOAS COM MENOS DE 21:" +idade21);
		 System.out.println("\nQUANTIDADE DE PESSOAS ACIMA DE 50:" +idade50);
		
			 
	}

}
