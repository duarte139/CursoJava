package nelioalves;

import java.util.Locale;
import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero?");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			if(i % 2 != 0) {
				System.out.println("Numeros impares: " + i);
			}
			
		}
		
		sc.close();

	}

}
