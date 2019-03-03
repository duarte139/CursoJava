package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] vet = new String[N];
		
		for(int i=0;i<N;i++) {
			vet[i] = sc.next();
		}
		for(int i=0;i<N;i++) {
			System.out.println(vet[i]);;
		}
		
		for(String obj:vet) {
			System.out.println(obj);;
		}
				
		
		sc.close();

	}
}
