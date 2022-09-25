package br.com.letscode.java;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        String[] promoFrutas = { "banana", "maçã", "abacaxi", "melão", "mamão" };
        System.out.println("=== Bem-vindo ao Hortifruti Java ===");
        Scanner input = new Scanner(System.in);

//        String[] frutasEmPromocao = solucaoUm(promoFrutas, input);
        String[] frutasEmPromocao = solucaoDois(promoFrutas, input);

        System.out.println("Você comprou as seguintes frutas em promoção: " + Arrays.toString(frutasEmPromocao));
        System.out.println("Portanto, receberá um desconto de " + frutasEmPromocao.length * 5 + "%.");

    }

    private static String[] solucaoDois(String[] promoFrutas, Scanner input) {
        System.out.println("Informe uma fruta em cada linha para adicionar à sua lista de compras. Deixe em branco para finalizar.");
        String compra = input.nextLine();
        String[] frutasEmPromocao = new String[5];
        int contFrutasPromo = 0;
        while (!compra.isEmpty()) {
            for (String promoFruta : promoFrutas) {
                if (promoFruta.equalsIgnoreCase(compra)) {
                    frutasEmPromocao[contFrutasPromo++] = compra;
                    break;
                }
            }
            compra = input.nextLine();
        }
        String[] resultado = new String[contFrutasPromo];
        System.arraycopy(frutasEmPromocao, 0, resultado, 0, contFrutasPromo);
        return resultado;
    }

    private static String[] solucaoUm(String[] promoFrutas, Scanner input) {
        System.out.println("Informe sua lista de compras separando por vírgulas. Exemplo: banana,uva.");
        String compra = input.nextLine();
        String[] listaCompra = compra.split(",");
        String[] frutasEmPromocao = new String[listaCompra.length];
        int cont = 0;
        for (String fruta : listaCompra) {
            for (String promoFruta : promoFrutas) {
                if (promoFruta.equalsIgnoreCase(fruta)) {
                    frutasEmPromocao[cont++] = fruta;
                    break;
                }
            }
        }
        return frutasEmPromocao;
    }
}
