package br.com.letscode.java;

import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com um número de 1 a 10");
        int numero = input.nextInt();
        System.out.println("A tabuada de " + numero + " é: ");
        for(int i=1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + i*numero);
        }
    }
}
