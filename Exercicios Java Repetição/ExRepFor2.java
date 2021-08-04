//2- Ler 10 números e imprimir quantos são pares 
//e quantos são ímpares. (FOR)


package Turma29;

import java.util.Scanner;

public class ExRepFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
        int num,contPar=0,contImpar=0;
        
        for(int i=1; i <= 10; i++){
            System.out.println("Digite um número");
            num = leia.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

            if(num % 2 == 1){
                contImpar++;
            }
            
        }
        
        System.out.println("\nForam digitados " +contPar+ " números pares");
        System.out.println("\nE " +contImpar+ " números ímpares");
        
	
    }
}