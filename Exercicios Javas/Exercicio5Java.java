//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente.


package Turma29;

import java.util.Scanner;

public class Exercicio5Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1=2,nota2=3,nota3=5, media;
		Scanner leia = new Scanner(System.in);
		
		media = (nota1+nota2+nota3) / 3;
		System.out.printf("\nSua média é: %2.2f  " ,media); 
		
	}

}
