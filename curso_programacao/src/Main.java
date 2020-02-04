import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia");
		
		String nome = "Thallita";
		double renda = 1189.84;
		
		int idade = 23;
		System.out.println(idade);
		
		double sal = 12.54654;
		System.out.printf("%.2f%n", sal);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n%n", sal);
		
		System.out.println("RESULTADO = " + sal + " m");
		System.out.printf("Result = %.2f metros%n", sal);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
