package Czesc2;

import java.util.Scanner;

public class Najwieksza {
	public static void ap(int a,int b,int c)
	
	{
		int min=0,max=0,sr=0;
		if(a<b)
		{
	max=b;
	min=a;
	
			
		}
			else
				max=a;
	            min=b;		
				
				
	            {
			if(c>max)
			{
				sr=max;
				max=c;
			}
			else
			if(c<min)
			{
				sr=min;
				min=c;
			}
			else
			sr=c;
		}
		System.out.println("max:"+max);
		System.out.println("sr:"+sr);
		System.out.println("min:"+min);
		
	}
		
		
	
	public static Scanner cin;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cin = new Scanner(System.in);

		int d1,d2,d3;
		System.out.println("Podaj pierwsz¹ liczbe");
		d1=cin.nextInt();
		System.out.println("Podaj drug¹ liczbe");
		d2=cin.nextInt();
		System.out.println("Podaj trzecia liczbe");
		d3=cin.nextInt();
		ap(d1,d2,d3);
	}

}
