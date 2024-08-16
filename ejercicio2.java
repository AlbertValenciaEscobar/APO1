import java.util.Scanner;

public class ejercicio2 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        int dia;
        int interes;
        int prestamo;
        int meses;
        int fina;
        System.out.print("ingrese en que dia del año vas a pedir el prestamo: ");
        dia = scanner.nextInt (); 
        System.out.println("ingrese el interes del 1 al 20 ");
        interes= scanner.nextInt ();
        System.out.print("De cuanto es el prestamo: ");
        prestamo.scanner.nextInt ();
        dia=dia/30;
        meses=12;
        meses=meses-dia;
        fina=((prestamo*interes)/100)*meses;
        System.out.print("Los intereces totales del prestamo al final del año es de " + fina);
        scanner.close();
    }
}