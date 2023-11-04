/*
-Ejercicio07-
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ejercicio07;
/**
 * @author: Toretto de Rapidos y Furiosos, asi es, leiste bien, Toretto de Rapidos y Furiosos. 
 */
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner NutriaSalvaje = new Scanner(System.in);
        double NutriaDomestica, NutriaTrabajadora, NutriaFloja, NutriaCamicasi, NutriaResponsable;
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        NutriaDomestica = NutriaSalvaje.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        NutriaTrabajadora = NutriaSalvaje.nextDouble();
        System.out.println("Dame tu edad");
        NutriaFloja = NutriaSalvaje.nextDouble();
        NutriaCamicasi = NutriaDomestica*NutriaTrabajadora;
        if (NutriaFloja >= 65) {
            NutriaResponsable = NutriaCamicasi*10/100;
            NutriaCamicasi = NutriaCamicasi - NutriaResponsable;
            System.out.println("El valor de la planilla es:" + " " + NutriaCamicasi);  
        }
        else {
            System.out.println("El valor de la planilla es" + " " + NutriaCamicasi);
        }
    }   
}