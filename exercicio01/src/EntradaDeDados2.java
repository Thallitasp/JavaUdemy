import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine(); //l� uma linha inteira || l� at� ser apertado o enter
		//OBS.> sc.nextLine(); //limpa o buffer para n�o contar o espa�o como uma frase
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
