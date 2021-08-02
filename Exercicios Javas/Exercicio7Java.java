package Turma29;

import java.util.Scanner;

public class Exercicio7Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextFloat();
		System.out.println("\nEntre com o valor de D: ");
		d = leia.nextFloat();
		System.out.println("\nEntre com o valor de E: ");
		e = leia.nextFloat();
		System.out.println("\nEntre com o valor de F: ");
		f = leia.nextFloat();
				
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		
		System.out.println("\nValor de X: "+x);
		System.out.println("\nValor de Y: "+y);
		
		
	}

}
