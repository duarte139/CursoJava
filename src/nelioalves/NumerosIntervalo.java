package nelioalves;

import java.util.Locale;
import java.util.Scanner;

public class NumerosIntervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n ; i++) {
			int x = sc.nextInt();
			if ( x >= 10 && x <= 20) {
				in = in + 1;
			}else {
				out = out + 1;
			}
		}
		System.out.println(in);
		System.out.println(out);
		sc.close();

	}

}
