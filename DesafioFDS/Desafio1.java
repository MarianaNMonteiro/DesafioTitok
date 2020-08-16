package DesafioFDS;

public class Desafio1 {

	public static void main(String[] args) {

		int i = 1 ;
		long x = 1 ;
		long y = 1 ; 

		do {

			System.out.println( "Casa " + i + " - Qtd: " + x + " - Soma: " + y );

			i = i + 1;
			x = x*2  ;
			y = y + x; 
		} 

		while (i <= 64);

	}
}





