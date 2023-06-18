package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectanglee;

public class RectangleOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectanglee rectangle = new Rectanglee();
		
		System.out.println("Enter the rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
		
		sc.close();
	}

}
