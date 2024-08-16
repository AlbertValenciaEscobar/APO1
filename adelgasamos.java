import java.util.Scanner;

public class adelgasamos{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        float metros;
        int metros2;
        int peso;
        float secciones;
        float caloriasPorSeccion;
        float nSecciones;
        int semanas;
        int clienteSecciones;

        System.out.println("Digite su altura");
        metros=sc.nextFloat ();
        metros=metros-1.10f;
        metros=metros*100f;
        metros2=(int)metros;

        System.out.println("digite su peso");
        peso=sc.nextInt ();
        peso=peso-metros2;
        caloriasPorSeccion=450*0.75f;
        secciones=3500*peso;
        nSecciones= secciones/caloriasPorSeccion;

        System.out.print("para bajar "+peso);
        System.out.print(" kilos para conseguir tu peso ideal, nesecitamos "+nSecciones);
        System.out.println(" seciones");
        System.out.println("Cuantas seciones quiere hacer por semana");
        clienteSecciones=sc.nextInt ();
        semanas= (int)nSecciones/clienteSecciones;
        System.out.print("Eso es igual a "+semanas);
        System.out.println(" semanas");
        



    }
}