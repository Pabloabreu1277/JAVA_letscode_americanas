package br.com.letscode.java;

import java.util.Scanner;

public class QuestaoQuatro {

    public static void main(String[] args) {
        String[] promoFrutas = { "banana", "maçã", "abacaxi", "melão", "mamão" };
        System.out.println("Qual fruta você deseja comprar hoje?");
        Scanner input = new Scanner(System.in);
        String compra = input.nextLine();
        boolean frutaEmPromocao = false;
        for (String promoFruta : promoFrutas) {
            if (promoFruta.equalsIgnoreCase(compra)) {
                frutaEmPromocao = true;
                break;
            }
        }
        if (frutaEmPromocao) {
            System.out.println("Ótima escolha! Essa fruta está em promoção hoje.");
        } else {
            System.out.println("Sua fruta não está em promoção hoje.");
        }
    }
}
