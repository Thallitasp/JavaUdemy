package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeights {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serão digitadas?");
		int qtd = sc.nextInt();

		String[] vectName = new String[qtd];
		int[] vectAge = new int[qtd];
		double[] vectHeight = new double[qtd];
		
		double sum = 0.0;
		int qtdPessoas = 0;
		double media = 0.0;
		
		String[] vectName16 = new String[qtd];
		
		for(int i=0; i<vectName.length; i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa: ");
			System.out.print("Nome: ");
			vectName[i] = sc.next();
			
			System.out.print("Idade: ");
			vectAge[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			vectHeight[i] = sc.nextDouble();
			
			sum+= vectHeight[i];
			
			if(vectAge[i] < 16) {
				vectName16[qtdPessoas] = vectName[i];
				qtdPessoas += 1;
			}
		}
		
		media = sum/qtd;
		
		double pp16menos = 100.0 * qtdPessoas/qtd;
		
		System.out.printf("Altura média: %.2f%n", media);
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", pp16menos);
		
		System.out.println("Pessoas com menos de 16 anos: " + qtdPessoas);
		
			for(int i=0; i<vectAge.length; i++) {
				if(vectAge[i] < 16) {
					System.out.println(vectName[i]);
				}
			}
		
		sc.close();
	}
}
