package br.com.lacosrepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int numero = 0, numeropar = 0, numeroimpar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
		
			if(numero % 2 == 0) {
				numeropar++;
				
			}
			else {
			numeroimpar++;	
			}
		}

		System.out.println("Total de n�meros pares: " + numeropar);
		System.out.println("Total de n�meros impares: " + numeroimpar);
		
		entrada.close();
	}

}
