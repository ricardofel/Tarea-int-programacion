/*
-Algoritmo05-
Generar un algoritmo que permita calcular y mostrar el costo de una computadora de escritorio. 
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package ejercicio05;
/**
 * @author: Voldemort de Harry Potter, asi es leiste bien Voldemort de Harry Potter
 */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner UnicornioLoco = new Scanner(System.in);
        double UnicornioCuerdo, UnicornioNarcicista, UnicornioEgocentrico, UnicornioCapitalista, UnicornioAgresivo;
        System.out.println("Ingresa el costo del CPU");
        UnicornioCuerdo = UnicornioLoco.nextDouble();
        System.out.println("Ingresa el costo del teclado");
        UnicornioNarcicista = UnicornioLoco.nextDouble();
        System.out.println("Ingresa el costo de la pantalla");
        UnicornioEgocentrico = UnicornioLoco.nextDouble();
        System.out.println("Ingresa el costo de el raton");
        UnicornioCapitalista = UnicornioLoco.nextDouble();
        UnicornioAgresivo = UnicornioCuerdo + UnicornioNarcicista + UnicornioEgocentrico + UnicornioCapitalista;
        System.out.println("El total a pagar es: " + UnicornioAgresivo + " asi que empieza a chambear");
        
    }   
}