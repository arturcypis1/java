
	package tab1;
import java.util.Random;

public class zad5 {

	public static void main(String[] args) {
		int[] tab=new int[25];
		 
		 
		for(int i=0;i<tab.length;i++){
		}
			System.out.println("Oto podana tablica:");
			Random ran = new Random(0);
			for(int i=0;i<tab.length;i++){
			tab[i]=ran.nextInt(100);	
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
	


	
	