import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		int y;
		y = sc.nextInt();
		
		double w;
		w = sc.nextDouble();
		
		//pode digitar tudo na mesma linha separado por espa�os ou ir apertando enter conforme foi inserindo os dados
		System.out.println("Voc� digitou: " + x);
		
		System.out.println("O n�mero inteiro inserido foi: " + y);
		
		System.out.println("O n�mero double inserido foi: " + w);
		
		//fechar a inser��o de dados
		sc.close();
	}
}
