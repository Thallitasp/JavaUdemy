package exercicio01;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.priceDolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		cc.amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", cc.pagarValor());

		sc.close();
	}

}
