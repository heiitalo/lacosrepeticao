package br.com.lacosrepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, multiplo3 = 0;
		int contador = 0;

		do {
			System.out.println("Por favor digite um n�mero: ");
			numero = entrada.nextInt();

			if (numero % 3 == 0) {
				multiplo3 += numero;
				contador++;
			}
		} while (numero != 0);

		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + multiplo3 / (contador - 1));

		entrada.close();
	}
}