package exercicio04;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProductOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.println("Product Name: ");
		product.Name = sc.nextLine();
		System.out.println("Product Price: ");
		product.Price = sc.nextDouble();
		System.out.println("Product Quantity: ");
		product.Quantity = sc.nextInt();
		
		/*
		 * System.out.println(product.Name + ", " + product.Price + ", " +
		 * product.Quantity);
		 * 
		 * System.out.println("Em quanto deseja aumentar o estoque?"); int sum =
		 * sc.nextInt();
		 * 
		 * product.AddProducts(product.Quantity, sum);
		 * 
		 * System.out.println("Em quanto deseja diminuir o estoque?"); int sub =
		 * sc.nextInt();
		 * 
		 * product.RemoveProducts(product.Quantity, sub);
		 * 
		 * System.out.printf("Nova Quantidade em estoque: %d%n", product.Quantity);
		 * System.out.printf("Valor: R$ %.2f",
		 * product.totalValueInStock(product.Quantity, product.Price));
		 */
		System.out.println("Product data:");
		System.out.println(product);
		
		System.out.print("Enter the number of products to be added in stock");
		int sum = sc.nextInt();
		product.AddProducts(sum);
		
		System.out.println();
		System.out.print("Update Data:");
		System.out.println(product);
		
		System.out.print("Enter the number of products to be removed in stock");
		int dim = sc.nextInt();
		product.AddProducts(dim);
		
		System.out.println();
		System.out.print("Update Data:");
		System.out.println(product);
		
		sc.close();
	}

}
