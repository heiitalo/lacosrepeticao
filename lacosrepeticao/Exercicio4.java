package br.com.lacosrepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int pessoas = 1;
	int idade = 0;
	int sexoF = 0, sexoM = 0, sexoO = 0, sexo = 0;
	int calmo = 0, nervoso = 0, agressiva = 0;
	
	while(pessoas <= 5) {
		System.out.println(pessoas + "� " + "Participande " + "Digite a sua idade: ");
	    idade = entrada.nextInt();
	    
	    System.out.println(pessoas + "� " + "Participande " + "Se voc� for mulher digite: 1, se for homem digite: 2 se n�o se enquandra em nenhum dos sexos digite: 3");
	    sexo = entrada.nextInt();
	    
	    if(sexo == 1) {
	    	sexoF++;
	    	}
	    if(sexo == 2) {
	    	sexoM++;
	    	}
	    if(sexo == 3) {
	    	sexoO++;
	    }
	    else {
	    	System.out.println("Por favor digite uma op��o v�lida!");
	    }
	pessoas++;
	}
	
	
	
	
	
	
	
			
	
	

	}

}
