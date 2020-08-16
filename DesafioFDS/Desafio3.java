package DesafioFDS;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		String frase; 
		int total = 0;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Digite uma frase qualquer : " );
		frase = leTeclado.nextLine();

		for(int i = 0; i< frase.length(); i++){
			if(frase.charAt(i)== 'a'){
				total=total+1;
			}
		}
		System.out.println("Tem o total de A = " + total );

	}

}
