package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSumVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você vai digitar?");
		int qtd = sc.nextInt();
		
		double[] vect = new double[qtd];
		double sum = 0.0;
		
		if(qtd < 0  || qtd == 0) {
			System.out.printf("Escolha uma quantidade maior que zero.");
		} else {		
			for(int i=0; i<qtd; i++) {
				System.out.printf("Digite um número: ");
				vect[i] = sc.nextDouble();
				sum += vect[i];
			}
			
			double avg = sum / vect.length;
			
			System.out.print("VALORES =");
			
			for(int i=0; i<vect.length; i++) {
				System.out.print(" ");
				System.out.print(vect[i]);
			}
			System.out.println();
			System.out.printf("SOMA = %.2f%n", sum);
			System.out.printf("MEDIA = %.2f%n", avg);
		}
		
		sc.close();
	}

}
