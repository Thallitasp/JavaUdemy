package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeOO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Employee: %s, $ %.2f",employee.name, employee.NetSalary());
		
		System.out.println();
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Update data: %s, $ %.2f", employee.name, employee.IncreaseSalary(percentage));
		sc.close();

	}

}
