import java.util.Scanner;

public class Dime{
    public static void main (String[] args){
         Scanner sc = new Scanner (System.in);
    System.out.println("ingrese cinco numeros a continuacion: ");
    int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     int n3 = sc.nextInt();
     int n4 = sc.nextInt();
     int n5 = sc.nextInt();

     double prom=promedio(n1,n2,n3,n4,n5);
     double divi=diviciblePorDies(n1,n2,n3,n4,n5);
       System.out.println("El promedio de todos los numeros es de: "+prom);
       System.out.println("los numeros dividives por dies son: "+divi);
       
    }
     public static double  promedio(int v1, int v2, int v3, int v4, int v5){
       double resultado;
        resultado=(v1+v2+v3+v4+v5)/5.0;
        return resultado;
     }
     public static void diviciblePorDies(int v1, int v2, int v3, int v4, int v5){
        int salida;
        div1=(v1%10==0)?1:0;
        div2=(v2%10==0)?1:0;
        div3=(v3%10==0)?1:0;
        div4=(v4%10==0)?1:0;
        div5=(v5%10==0)?1:0;
        salida=div1+div2+div3+div4+div5;
        return salida;
     }
}