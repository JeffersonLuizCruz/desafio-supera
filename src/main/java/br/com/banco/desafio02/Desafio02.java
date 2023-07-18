package br.com.banco.desafio02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Desafio02 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valorStr = scanner.nextLine(); 

        BigDecimal valor = new BigDecimal(valorStr.replace(",", ".")); 

        int[] notas = {100, 50, 20, 10, 5, 2};
        BigDecimal[] moedas = {new BigDecimal("1.00"), new BigDecimal("0.50"),
                new BigDecimal("0.25"), new BigDecimal("0.10"), new BigDecimal("0.05"), new BigDecimal("0.01")};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            int quantidadeNotas = valor.divide(new BigDecimal(notas[i]), 0, RoundingMode.DOWN).intValue();
            System.out.println(quantidadeNotas + " nota(s) de R$ " + notas[i] + ".00");
            valor = valor.remainder(new BigDecimal(notas[i]));
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++) {
            int quantidadeMoedas = valor.divide(moedas[i], 2, RoundingMode.DOWN).multiply(new BigDecimal("100")).intValue();
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + moedas[i]);
            valor = valor.remainder(moedas[i]);
        }
    }
}
