package tab1;
import java.util.Random;
public class tablice3 {

	public static void main(String[] args) {
		int[] tab=new int[5];
	
		 
		 
		for(int i=0;i<tab.length;i++){
		}
			System.out.println("Oto podana tablica:");
			Random ran = new Random(0);
			for(int i=0;i<tab.length;i++)
			tab[i]=ran.nextInt(200)-100;	
			for(int i=0;i<tab.length;i++)
			System.out.printf("%4d",tab[i]);
			
			
			int sumap=0;
			for(int i=0;i<tab.length;i++)
				if (tab[i]>0)
			sumap+=tab[i];
			System.out.println("\nSuma dodatnich"
					+ ": "+sumap);
			
			int suman=0;
			for(int i=0;i<tab.length;i++)
				if (tab[i]<0)
			suman+=tab[i];
			System.out.println("\nSuma ujemnych: "+suman);
			
		
		
		
		
		}	
		}
	