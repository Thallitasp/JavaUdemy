package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class SemOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3, areaX, areaY;
		
		System.out.println("Enter the measures of triangle X:");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double px = (x1 + x2 + x3)/2.0;
		areaX = Math.sqrt(px * (px - x1) * (px - x2) * (px - x3));
		
		double py = (y1 + y2 + y3)/2.0;
		areaY = Math.sqrt(py * (py - y1) * (py - y2) * (py - y3));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Larger area: X");
		}
		else {
			System.out.printf("Larger area: Y");
		}
	}

}
