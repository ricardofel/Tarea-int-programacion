/*
-Algoritmo02-
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; 
Calcular y mostrar el total de gastos de los hijos del padre de familia.
 */
package ejercicio02;
/**
 * @author: Shisuka de Doraemon
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner nobita = new Scanner(System.in);
        double doraemon;
        double suneo;
        double gigante;
        double dekisugui;
        System.out.println("Ingresa los gastos del hijo 1");
        doraemon = nobita.nextDouble();
        System.out.println("Ingresa los gastos del hijo 2");
        suneo = nobita.nextDouble();
        System.out.println("Ingresa los gastos del hijo 3");
        gigante = nobita.nextDouble();
        dekisugui = doraemon + suneo + gigante;
        System.out.println("Los gastos totales de los hijos son:" + " " + dekisugui);
    }   
}