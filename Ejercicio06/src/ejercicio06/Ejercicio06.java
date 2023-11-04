/*
-Algoritmo06-
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. 
Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ejercicio06;
/**
 * @author: Botas de Dora la exploradora
 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner CanguroJack = new Scanner(System.in);
        double CanguroMinistro, CanguroEmbajador, CanguroEmpresario;
        System.out.println("Ingresa el monto del prestamo");
        CanguroMinistro = CanguroJack.nextDouble();
        System.out.println("Ingresa el valor del interes mensual");
        CanguroEmbajador = CanguroJack.nextDouble();
        CanguroEmpresario = (CanguroMinistro/12)+CanguroEmbajador;
        System.out.println("El valor del pago mensual es:" + " " + CanguroEmpresario);
    }   
}