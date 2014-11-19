package tab2;
import java.util.Random;
public class zad3 {

	public static void main(String[] args) {
		int[] tab=new int[20];
	
		 
		 
		for(int i=0;i<tab.length;i++){
		}
			System.out.println("Oto podana tablica:");
			Random ran = new Random(0);
			for(int i=0;i<tab.length;i++)
			tab[i]=ran.nextInt(50);	
			for(int i=0;i<tab.length;i++)
			System.out.printf("%4d",tab[i]);
			
			System.out.println("");
			
			System.out.println("Oto posortowana tablica:");
			
				int p;			
					for(int i=0;i<(tab.length-1);i+=2){
					p=tab[i];
					
						tab[i]=tab[i+1];
						tab[i+1]=p;
						
				
					
				}
				
			
				for(int i=0;i<tab.length;i++)
					System.out.printf("%4d",tab[i]);
			
			
			
			
		
			
		
		}	
		}