package zadania;

import java.util.Scanner;

public class zad2 {
	public static Scanner cin;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);
		int l1;
		System.out.println("Podaj liczbe :");
		l1=cin.nextInt();
		
		
		for (int i=l1;i<=l1;i++)
		{
			if (l1%i==0)
				System.out.println(i);
			}
		
	}
}