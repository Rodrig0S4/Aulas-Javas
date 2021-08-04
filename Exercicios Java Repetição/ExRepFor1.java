//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

package Turma29;

public class ExRepFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1000; i < 1999; i++){
		    if (i%11==5) {
		        System.out.println(i);
		    }
		}
	}

}
