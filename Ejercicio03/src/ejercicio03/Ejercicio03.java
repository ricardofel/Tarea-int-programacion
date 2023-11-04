/*
-Algoritmo03-
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número 
ingresado por el usuario; 
Solo en el caso que el valor del número esté entre 2 y 6.
 */
package ejercicio03;
/**
 * @author: Dory de buscando a Nemo
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner CalamarGrande = new Scanner(System.in);
        int pulpito;
        double corrienteMarina;
        System.out.println("Dame un numero");
        pulpito = CalamarGrande.nextInt();
        if (pulpito>=2 && pulpito<=6){
            corrienteMarina = pulpito*1;
            System.out.println(pulpito + "x 1 = " + corrienteMarina);
            corrienteMarina = pulpito*2;
            System.out.println(pulpito + "x 2 = " + corrienteMarina);
            corrienteMarina = pulpito*3;
            System.out.println(pulpito + "x 3 = " + corrienteMarina);
            corrienteMarina = pulpito*4;
            System.out.println(pulpito + "x 4 = " + corrienteMarina);
            corrienteMarina = pulpito*5;
            System.out.println(pulpito + "x 5 = " + corrienteMarina);
            corrienteMarina = pulpito*6;
            System.out.println(pulpito + "x 6 = " + corrienteMarina);
            corrienteMarina = pulpito*7;
            System.out.println(pulpito + "x 7 = " + corrienteMarina);
            corrienteMarina = pulpito*8;
            System.out.println(pulpito + "x 8 = " + corrienteMarina);
            corrienteMarina = pulpito*9;
            System.out.println(pulpito + "x 9 = " + corrienteMarina);
            corrienteMarina = pulpito*10;
            System.out.println(pulpito + "x 10 = " + corrienteMarina);
            corrienteMarina = pulpito*11;
            System.out.println(pulpito + "x 11 = " + corrienteMarina);
            corrienteMarina = pulpito*12;
            System.out.println(pulpito + "x 12 = " + corrienteMarina);
        }
        else {
            System.out.println("Pon bien el numero pues bellaco");
        }
    }   
}