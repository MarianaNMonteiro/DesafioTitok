package DesafioFDS;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		int  i, n;
		double a = 0;

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Digite o valor de N : " );
		n = leTeclado.nextInt();

		for ( i = 0 ; i < n ; i++ ) {

			a +=  ( n - i ) / ( i + 1 );

		}		

		System.out.println( "A = " + a );

	}

}
