package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a area do triangulo x");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		
		System.out.println("Entre com a area do triangulo y");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		
		double p = (xA + xB+ xC)/2.0;
		double areax = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		 p = (yA + yB+ yC)/2.0;
		double areay = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
		
		System.out.printf("Triangulo X area: %.4f%n", areax);
		System.out.printf("Triangulo Y area: %.4f%n", areay);
		
		if(areax > areay) {
			System.out.printf("Area maior: X");
		}else {
			System.out.printf("Area maior: Y");
		}
		
		sc.close();

	}

}
