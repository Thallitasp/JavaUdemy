package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class NotasOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas nota = new Notas();

		nota.aluno = sc.nextLine();
		nota.nota1 = sc.nextDouble();
		nota.nota2 = sc.nextDouble();
		nota.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f", nota.mediaNota());
		System.out.println();
		
		if(nota.mediaNota() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", nota.faltamPontos());
		}
		
		sc.close();

	}

}
