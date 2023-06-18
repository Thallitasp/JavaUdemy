import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		
		do {
			//pergunta para o usuário a temperatura •em Celsius e devolver em Fahrenheit	
			System.out.print("Digite a temperatura em graus Celsius: ");
			
			double x = sc.nextDouble();
			
			double y = (9 * x) / 5 + 32;
			
			System.out.printf("Equivalente em Fahrenheit:%.1f%n", y);
			
			System.out.print("Deseja repetir (s/n)? ");
			
			resp = sc.next().charAt(0);
		} while(resp != 'n');
		
		sc.close();
	}

}
