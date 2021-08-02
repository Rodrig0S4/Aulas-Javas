//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão:

package Turma29;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,d,r,s;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nColoque um valor positivo: ");
		a = leia.nextDouble();
		System.out.println("\nColoque outro valor positivo: ");
		b = leia.nextDouble();
		System.out.println("\nColoque último valor positivo: ");
		c = leia.nextDouble();
		
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		
		System.out.println("\nResultado é:"+d);
		
			
		

	}

}
