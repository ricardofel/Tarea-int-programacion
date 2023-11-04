/*
-Algoritmo01-
Generar un algoritmo que permite calcular y presentar el área de un triángulo. 
Los datos deben ser pedidos al usuario.
*/
package ejercicio01;
/**
 * @author: Bozz Light Year de Toy Story pero version ecuatoriana
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner badbunnybb = new Scanner(System.in);
        double nutriaSalvaje;
        double nutriaDomestica;
        double LemurdeSabana;
        System.out.println("Ingrese la base del triangulo");
        nutriaSalvaje = badbunnybb.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        nutriaDomestica = badbunnybb.nextDouble();
        System.out.println("xoxoxoxoxoxoxoxoxoxoxoxoxoxoxox");
        LemurdeSabana = (nutriaSalvaje*nutriaDomestica)/2;
        System.out.println("El area del triangulo es:" + " " + LemurdeSabana);
    }
}