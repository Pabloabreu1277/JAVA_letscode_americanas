package br.com.letscode.java;

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 9.0/5.0 + 32;
        System.out.println("O equivalente a " + celsius + " C é " + fahrenheit + " F.");
    }
}
