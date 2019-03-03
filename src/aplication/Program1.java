package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student;
		student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f.%n", student.finalNota());
		System.out.println();
		
		if(student.finalNota()<60.00) {
			System.out.println("MISSING.");
			System.out.println();
			System.out.printf("MISSING %.2f POINTS.%n ", student.missingPoints());
		}else {
			System.out.println("PASS.");
		}
		
		sc.close();

	}

}
