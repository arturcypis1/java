package tab1;
import java.util.Scanner;
public class tablice4 {

	public static void main(String[] args) {
		int[] tab=new int[25];
		Scanner odczyt=new Scanner(System.in);
		System.out.println("Podaj elementy tablicy:");
		for(int i=0;i<tab.length;i++){
		System.out.print("Element "+i+": ");
		tab[i]=odczyt.nextInt();
		}
			System.out.println("Oto podana tablica:");
			for(int i=0;i<tab.length;i++){
			System.out.printf("%4d",tab[i]);
			if ((i+1)%5==0)
				System.out.println();
			}
			int suma=0;
			for(int i=0;i<tab.length;i++)
			suma+=tab[i];
		System.out.println("\nSuma wynosi: "+suma);

				
		
			
		
		}	
		}
	


	
	
		
