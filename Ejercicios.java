import java.util.Scanner;

public class Ejercicios {
    public static void main (String[] args){
        Scanner copia = new Scanner (System.in);
        int num;
        int seg;
        System.out.println("Introduce cierta cantidad de segundos");
        num = (int)copia.nextInt ();
        seg=num;
        num=num/60;
        seg=seg-(60*num);
        System.out.print("eso es igual a "+num);
          System.out.print(" minutos y "+seg);
           System.out.println(" segundos");
     }
}