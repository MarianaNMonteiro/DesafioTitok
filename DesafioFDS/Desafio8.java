package DesafioFDS;

import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		
		double aux, x1, x2;
		

		Scanner leTeclado = new Scanner(System.in); 
		System.out.println( "Digite o coeficiente de a : " );
		int a = leTeclado.nextInt();

		System.out.println( "Digite o coeficiente de b : " );
		int b = leTeclado.nextInt();
		
		System.out.println( "Digite o coeficiente de c : " );
		int c = leTeclado.nextInt();
		
		aux = Math.pow (b,2) - 4 * a * c ;
		x1 = (-b + Math.sqrt(aux)) / 2 *  a ;
		x2 = (-b - Math.sqrt(aux)) / 2 * a ;
		
	   System.out.println("X1 = " + x1 + " e X2 = " + x2 );

		}

	}


 