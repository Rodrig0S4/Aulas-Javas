//Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
//a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 

package Turma29;

public class ExArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []vA = new int [6];
		int soma=0, x ;
		
		for(x=0; x<6; x++) { //a)
			
			vA [0] = 1;
			vA [1] = 0;
			vA [2] = 5;
			vA [3] = -2;
			vA [4] = -5;
			vA [5] = 7;
			
			soma = vA [0] + vA[1] + vA[5]; //b)
	}
		System.out.println("\nA soma respectiva de suas posições 1, 2, e 6 é:" +soma);
		
		for(x=0 ; x<6; x++) {
			
			vA[4] = 100;
			
			System.out.println("\nO vetor concluído é: ");
			System.out.println("vA[x]");
			
		}
	}

}
