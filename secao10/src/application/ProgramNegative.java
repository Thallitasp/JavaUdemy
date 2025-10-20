package application;

import java.util.Locale;
import java.util.Scanner;


public class ProgramNegative {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quantos números você vai digitar?");
		int qtd = sc.nextInt();
		
		int[] vect = new int[qtd];
		
		if(qtd < 0  || qtd > 10) {
			System.out.printf("Escolha uma quantidade entre 1 e 10");
		} else {
			for(int i=0; i<qtd; i++) {
				System.out.printf("Digite um número: ");
				vect[i] = sc.nextInt();
			}

			System.out.println("Números negativos:");
			
			for(int i=0; i<vect.length; i++) {
				if(vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		}
		
		sc.close();
	}
}
