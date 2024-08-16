import java.util.Scanner;

public class menwomen {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        float men;
        float women;
        float total;
        System.out.println("cuantos hombres hay?");
        men=scanner.nextFloat ();
        System.out.println("cuantas mujeres hay?");
        women=scanner.nextFloat ();
        total=men+women;
        men=(men/total)*100;
        women=(women/total)*100;
        System.out.println("En la clase el porcentaje de hombres es de "+men);
        System.out.println("En la clase el porcentaje de mujeres es de "+women);
    }
}