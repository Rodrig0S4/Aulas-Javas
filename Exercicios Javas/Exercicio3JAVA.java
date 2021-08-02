//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.

package Turma29;

import java.util.Scanner;

public class Exercicio3JAVA {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float segundos, minutos, horas;

        System.out.println("\nEscreva em segundos quanto tempo durou o evento: ");
        segundos = leia.nextFloat();

        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        segundos = (segundos % 3600) % 60;

        System.out.println("\nO evento duroi um total de " + horas + "hora(s) e" + minutos + " minuto(s) e " + segundos + "segundo(s)");


    }
}