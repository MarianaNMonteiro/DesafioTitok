package DesafioFDS;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {

		String frase;
		int imaior=0;

		Scanner leTeclado = new Scanner (System.in);
		System.out.println("Introduza a frase");
		frase = leTeclado.nextLine();

		String quebra[] = frase.split(" ");  

		for ( int i = 0 ; i < quebra.length ; i++ ) {  

			if ( quebra[i].length() > quebra[imaior].length() ) {  
				imaior = i;  
			}  

		}  

		System.out.println("Maior palavra é:  "+quebra[imaior] );   
	}

}


