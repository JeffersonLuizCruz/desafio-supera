package br.com.banco.defafio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); 
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int valor = scanner.nextInt();
			if (valor % 2 == 0) {
				pares.add(valor);
			} else {
				impares.add(valor);
			}
		}

		pares.sort(Comparator.comparing(Integer::byteValue));
		impares.sort(Comparator.reverseOrder());

		for (int par : pares) {
			System.out.println(par);
		}

		for (int impar : impares) {
			System.out.println(impar);
		}
	}
}