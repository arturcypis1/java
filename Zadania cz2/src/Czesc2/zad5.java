package Czesc2;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		int a, b;
		System.out.println ("Podaj a: ");
		a = odczyt.nextInt();
		System.out.println ("Podaj b: ");
		b = odczyt.nextInt();
		System.out.println ("Rozwiazanie: " +  (b/a) + "," +b);		
	}

}