package br.com.lacosrepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int numero, total = 0;
	
	do {
		System.out.println("Por favor digite um n�mero: ");
	   numero = entrada.nextInt();
	   total += numero;
	   
	}
	while(numero != 0);
	
	System.out.println("A soma total dos n�meros �:" + total);
	
	entrada.close();
	}

	}


