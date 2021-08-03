//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

package Turma29;

import java.util.Scanner;

public class ExLacoDecisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3;
		
			try (Scanner leia = new Scanner(System.in)){
			System.out.println("\nEntre com N1: ");
			n1 = leia.nextInt();
			System.out.println("\nEntre com N2: ");
			n2 = leia.nextInt();
			System.out.println("\nEntre com N3: ");
			n3 = leia.nextInt();
		
	}

			if(n1>n2 && n1>n3){
			System.out.println("\nO valor de: "+n1);}
			
			else if(n2>n1 && n2>n3){
			System.out.println("\nO valor de: "+n2);}
			
			else {
			System.out.println("\nMaior nota: "+n3);}
			
	}		
}	

	
	