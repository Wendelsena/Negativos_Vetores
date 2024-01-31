import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Quantos Numeros quer digitar?: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");

	    for (int i = 0; i < vect.length; i++) {
	        if (vect[i] < 0) {
	        	System.out.printf("%.0fn", vect[i]);
	        }
	    }
		
		sc.close();
		

	}

}
