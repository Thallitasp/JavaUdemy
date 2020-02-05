import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); //string
		//x = sc.netInt();
		//x = sc.netDouble();
		System.out.println("Você digitou: " + x);
		sc.close();
	}
}
