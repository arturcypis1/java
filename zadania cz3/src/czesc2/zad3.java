import java.util.Scanner;
public class zad3 {
	public static Scanner cin;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		    int d1,d2;
		    
		    char odp;
		    
		    do
		    {
		    	cin = new Scanner(System.in);
		    	System.out.println("Podaj 1 liczbe");
		    	d1=cin.nextInt();
		    	System.out.println("Podaj 2 liczbe");
				d2=cin.nextInt();
				System.out.println("Podaj znak +,-,*,/,%,^");
				char znak=cin.nextLine().charAt(0);	         
		         switch(znak)
		         {
		         case '-' : System.out.println("wynik "+"odejmowania:"+(d1-d2));
		         break;
		         case '*' : System.out.println("wynik "+"mno�enia:"+(d1*d2));
		         break;
		         case '+' : System.out.println("wynik "+"dodawania:"+(d1+d2));
		         break;
		         case '/' : System.out.println("wynik "+"dzielenia:"+(d1/d2));
		         break;
		         case '%' : System.out.println("wynik "+"pierwiastkowanie:"+(d1%d2));
		         break;
		         case '^' : System.out.println("wynik "+"potegowania:"+(d1^d2));
		         break;
		         }
		         		         
		         System.out.println("czy chcesz to powtorzyc?(t/n)");
			     odp=(cin.nextLine()).charAt(0);

		         }
		    while(odp=='t' || odp=='T');
		         }
	}

}
