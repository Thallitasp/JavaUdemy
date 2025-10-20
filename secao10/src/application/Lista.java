package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Lista {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();
		
		System.out.printf("How many employees will be registered?");
		int qtd = sc.nextInt();
		
		for(int i=0; i < qtd; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name,salary);
			lista.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase:");
		int idEmployee = sc.nextInt();

		
		System.out.println();
		System.out.print("Enter the percentage:");
		double percent = sc.nextDouble();
		
		for(int i=0; i<qtd; i++) {
			if(lista.get(i).getId() == idEmployee) {
				lista.get(i).setSalary(lista.get(i).getSalary() * percent / 100 + lista.get(i).getSalary());
			}
		}
		
		for(int i=0; i<qtd; i++) {
			System.out.println("List of employees:");
			System.out.println(lista.get(i).getId() + ", " + lista.get(i).getName() + ", " + lista.get(i).getSalary());

		}
		
		
		sc.close();
		
	}
}
