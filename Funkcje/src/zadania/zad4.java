package zadania;
import java.util.Scanner;

public class zad4 {
    public static int NWD(int a, int b) {
        if (b == 0){ return a; }
 
    return NWD(b, (a % b));
    }
 
 
    public static void main(String args[]){
        int a; int b; int nww;
        System.out.println("Podaj pierwsz¹ liczbê: ");
        Scanner cin=new Scanner(System.in);
        a = cin.nextInt();
        System.out.println("Podaj drug¹ liczbê: ");
        b = cin.nextInt();
 
        nww = (a*b);
 
        System.out.println("NWW ("+a+","+b+") = "+nww);
    }
}