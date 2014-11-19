package tab1;
import java.util.Scanner;
public class tablice1 {

	public static void main(String[] args) {
		int[] tab=new int[5];
		Scanner odczyt=new Scanner(System.in);
		System.out.println("Podaj elementy tablicy:");
		for(int i=0;i<tab.length;i++){
		System.out.print("Element "+i+": ");
		tab[i]=odczyt.nextInt();
		}
			System.out.println("Oto podana tablica:");
			for(int i=0;i<tab.length;i++)
			System.out.printf("%4d",tab[i]);
			int suma=0;
			for(int i=0;i<tab.length;i++)
			suma+=tab[i];
			System.out.println("\nSuma wynosi: "+suma);
			
		
		
		
		
		}	
		}
	


	
	
		

	