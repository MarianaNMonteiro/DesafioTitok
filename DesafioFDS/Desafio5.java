package DesafioFDS;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		int a = 1; 
		int aux;
		int b = 0;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Digite o valor de N : " );
		int n = leTeclado.nextInt();

		for (int i=1; i <= n; i++) {
			
			System.out.println(a);

			aux = a;  
			a = a + b;
			b = aux; 

		}

	}
}


