/*
-Algoritmo04-
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de un casa. 
Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package ejercicio04;
/**
 * @author: Jorge de Jorge el curioso, asi es de Jorge el curioso.
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tigresa = new Scanner(System.in);
        double cacatuaBrutal, tucanMounstruoso, papagayoSalvaje;
        System.out.println("Ingresa el valor del costo por minuto");
        cacatuaBrutal = tigresa.nextDouble();
        System.out.println("Ingresa el valor de los minutos consumidos");
        tucanMounstruoso = tigresa.nextDouble();
        papagayoSalvaje = cacatuaBrutal * tucanMounstruoso;
        System.out.println("El valor de la planilla a pagar es: $" + papagayoSalvaje);
    }   
}