package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter the employer data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Gorss Salary: ");
		product.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		product.Tax = sc.nextDouble();
		
		System.out.println(product);
		
		System.out.println();
		System.out.println("Which percentage to increase salary ? ");
		double percentage = sc.nextDouble();
		product.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data:  " + product);
	
	}

}
