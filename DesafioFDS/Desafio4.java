package DesafioFDS;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		String frase;

		Scanner leTeclado = new Scanner (System.in);
		System.out.println("Digite uma frase qualquer : ");
		frase = leTeclado.nextLine();

		String quebra[] = frase.split(" ");  

	  System.out.println("Tem o total de palavras  " + quebra.length );    
	}

}

