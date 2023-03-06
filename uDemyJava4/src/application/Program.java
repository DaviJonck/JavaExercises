package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Note from the 3 quarters");
		student.noteA = sc.nextDouble();
		student.noteB = sc.nextDouble();
		student.noteC = sc.nextDouble();
		
		System.out.println();
		System.out.println(student);
		
		if(student.allNotes() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f", student.missingNote());
			
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
