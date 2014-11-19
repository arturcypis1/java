package tab1;
import java.util.Random;
public class tablice2 {

	public static void main(String[] args) {
		int[] tab=new int[10];
	
		 
		 
		for(int i=0;i<tab.length;i++){
		}
			System.out.println("Oto podana tablica:");
			Random ran = new Random(0);
			for(int i=0;i<tab.length;i++)
			tab[i]=ran.nextInt(100);	
			for(int i=0;i<tab.length;i++)
			System.out.printf("%4d",tab[i]);
			
			
			int sumap=0;
			for(int i=0;i<tab.length;i++)
				if (tab[i]%2==0)
			sumap+=tab[i];
			System.out.println("\nSuma parzystych wynosi: "+sumap);
			
			int suman=0;
			for(int i=0;i<tab.length;i++)
				if (tab[i]%2!=0)
			suman+=tab[i];
			System.out.println("\nSuma nieparzystych wynosi: "+suman);
			
		
		
		
		
		}	
		}
	
