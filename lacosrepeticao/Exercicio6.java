package br.com.lacosrepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, multiplo3 = 0;
		int contador = 0;

		do {
			System.out.println("Por favor digite um número: ");
			numero = entrada.nextInt();

			if (numero % 3 == 0) {
				multiplo3 += numero;
				contador++;
			}
		} while (numero != 0);

		System.out.println("A média dos números múltiplos de 3 é: " + multiplo3 / (contador - 1));

		entrada.close();
	}
}