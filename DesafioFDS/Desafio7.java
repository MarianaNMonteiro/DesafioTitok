package DesafioFDS;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {

		int impar =0;
		int par = 0;

		for(int n = 1; n <= 50; n++) {
		
			if(n % 2 == 0) {
				par += n;

			} else {                                         
				impar += n;
			}
		}
			System.out.println(" Fatorial é : " + fatorial(par - impar));

		}

		public static double fatorial(int numero) {
			if (numero <= 1) {

				return 1;

			} else {

				return fatorial(numero - 1) * numero;

			}

		}
	}


