//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.


package Turma29;

import java.util.Scanner;

public class ExArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		
		float m[][] = new float [2][2];
		float m2[][] = new float [2][2];
		float m3[][] = new float [2][2];
		int escolha, l, c;
		final double adc=3;
		
		for (l=0; l<2; l++) {
		for(c=0; c<2; c++) {
				
				System.out.println("\nDigite um valor para a matriz");
				m[l][c] = leia.nextInt();
				
			}
		}
		
		for (l=0; l<2; l++) {
		for(c=0; c<2; c++) {
				
				System.out.println("\nDigite um valor para a matriz");
				m2[l][c] = leia.nextInt();
				
			}
		}
				System.out.println("\nEscolha uma das opções abaixo:");
				System.out.println("\n1 Somar as matrizes:");
				System.out.println("\n2 Subtrair a 1º matriz da 2º matriz:");
				System.out.println("\n3 Adicionar uma constante as DUAS matrizes:");
				System.out.println("\n4 Para imprimir as duas matrizes:");
				escolha = leia.nextInt();
		
		for (l=0; l<2; l++) {
		for(c=0; c<2; c++) {
		switch (escolha) {
		
		case (1):
		m3[l][c] = m[l][c] + m2[l][c];
				System.out.printf("[%2.1f]", + m3[l][c]);
		
		break;
		
		case (2):
		m3[l][c] = m[l][c] - m2[l][c];
				System.out.printf("[%2.1f]",m3[l][c]);
			
		
		case(3):
		m[l][c] += adc;
		m2[l][c] += adc;
		
				System.out.printf("[%2.1f]",m[l][c]);
				System.out.printf("[%2.1f]",m2[l][c]);
		
		break;
		
		case (4):
				System.out.printf("[%2.1f]",m[l][c]);
				System.out.printf("[%2.1f]",m2[l][c]);
		break;
		
		}
		
	}System.out.println();
		
		
		}	
	}
}
