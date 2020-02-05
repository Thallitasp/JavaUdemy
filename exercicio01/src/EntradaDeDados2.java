import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine(); //lê uma linha inteira || lê até ser apertado o enter
		//OBS.> sc.nextLine(); //limpa o buffer para não contar o espaço como uma frase
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
