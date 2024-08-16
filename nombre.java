import java.util.Scanner;

public class nombre {
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int n1, n2, n3, fin;
         System.out.println("digite un numero");
        n1=scanner.nextInt ();
        scanner.nextLine ();
        System.out.println("Escriba tu nombre");
        nombre=scanner.nextLine ();
        System.out.println("digite un numero");
        n2=scanner.nextInt ();
        System.out.println("digite un numero");
        n3=scanner.nextInt ();
        fin=n1+n2+n3;
        System.out.println("La suma de todos los numeros digitados es: "+fin );
        System.out.println("Su nombre es: "+ nombre);

    }
}