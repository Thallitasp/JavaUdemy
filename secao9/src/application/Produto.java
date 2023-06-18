package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produto {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Product Name: ");
		String name = sc.nextLine();
		System.out.println("Product Price: ");
		double price = sc.nextDouble();
		//System.out.println("Product Quantity: ");
		//int quantity = sc.nextInt();
		System.out.println();
		
		Product product = new Product(name, price);

		System.out.println("Product data:");
		System.out.println(product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int sum = sc.nextInt();
		product.AddProducts(sum);
		
		System.out.println();
		System.out.print("Update Data:");
		System.out.println(product);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int dim = sc.nextInt();
		product.RemoveProducts(dim);
		
		System.out.println();
		System.out.print("Update Data:");
		System.out.println(product);
		
		sc.close();
	}
}
