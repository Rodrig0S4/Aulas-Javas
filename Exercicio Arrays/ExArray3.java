//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package Turma29;

import java.util.Scanner;

public class ExArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		int mtz [][] = new int [3][3];
		int cont10=0;
			
		for(int l=0; l<3; l++){
		for(int c=0; c<3; c++){

			System.out.println("\nColoque o valor desejado:");
			mtz[l][c] = leia.nextInt();
			
		if (mtz[l][c]>10){
			cont10++;
		
		}
		}
		
		
	}
		System.out.println("\nO número de valores acima de 10 é: "+cont10);

	}
}
