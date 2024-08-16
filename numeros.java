
import java.util.Scanner;

public class numeros{
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("ingrese el numero uno");
    int n1=sc.nextInt ();
   System.out.println("ingrese el numero dos");
    int n2=sc.nextInt ();

    int sumaCuadrados=sumEnteros(n1,n2);
    sumaCuadProc(10,30);
    }

    public static int sumEnteros(int v1, int v2){
        int resultado=0;
        resultado=(v2*v2)+(v1*v1);
        return resultado;
    }

    public static void sumaCuadProc(int v1, int v2){
        int resultado=0;
        resultado=(v2*v2)+(v1*v1);
         System.out.println("la suma de los cuadrados es: "+resultado);
    }
}