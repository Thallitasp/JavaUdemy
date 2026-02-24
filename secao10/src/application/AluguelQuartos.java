package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CadastroAluguel;

public class AluguelQuartos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CadastroAluguel[] vect = new CadastroAluguel[10];
		
		System.out.println("How many rooms will be rented?");
		int qtd = sc.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new CadastroAluguel(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();
		
	}
}
