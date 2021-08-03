//2-Faça um programa que entre com três números e coloque em ordem crescente.

package Turma29;

import java.util.Scanner;

public class ExLacoDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com C: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente: "+a+", "+b+" e "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente: "+a+", "+c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente: "+b+", "+a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente: "+b+", "+c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente: "+c+", "+a+" e "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+c+", "+b+" e "+a);
		}
	}

}

