//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.


package Turma29;

import java.util.Scanner;

public class ExArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int v[] = new int[6];
		int x, sPares=0, cImpares=0;
		
		for(x=0; x<6; x++) {
			
			System.out.println("\nEntre com um número: ");
			v[x] = leia.nextInt();
			
			if(v[x] % 2 ==0) {
				
				sPares += v[x];
				System.out.println("\nO número par digitado foi:" +v[x]);
			}
			else {
				cImpares++;
				System.out.println("\nO número impar digitado foi:" +v[x]);
				
			}
  		}
		
		System.out.println("\nA soma dos números pares foram de:" +sPares);
		System.out.println("\nA soma dos números ímpares foram de:" +cImpares);
	}

}
