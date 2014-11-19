package Czesc2;

import java.util.Scanner;

public class zad4 {

	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		int a, b;
		System.out.println ("Podaj a: ");
		a = odczyt.nextInt();
		System.out.println ("Podaj b: ");
		b = odczyt.nextInt();
		if (a == 0 && b == 0)
		{
			System.out.println ("Nieskonczenie wiele rozwiazan");
		}
		if (a == 0 && b != 0)
		{
			System.out.println ("Brak rozwiazan");
		}
		if (a != 0)
		{
			System.out.println ("Rozwiazanie: " + (b/a));
		}				
	}

}