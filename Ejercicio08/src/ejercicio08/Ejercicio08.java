/*
-Algoritmo08-
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual 
de servicios digitales de una persona. 
Los servicios digitales son: netflix, youtube premium, dropbox, spotify. 
Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ejercicio08;
/**
 * @author: Benzon de un show mas, Como tan Muchacho? Que tal pal de chicle? 
 */
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner Yunikua = new Scanner(System.in);
        double MedusaBailarina, MedusaIngeniera, MedusaModelo, MedusaBombero, MedusaCantante, Medusita, MedusaGrande;
        System.out.println("Ingresa el costo de Netflix");
        MedusaBailarina = Yunikua.nextDouble();
        System.out.println("Ingresa el costo de Youtube Premium");
        MedusaIngeniera = Yunikua.nextDouble();
        System.out.println("Ingresa el costo de Dropbox");
        MedusaModelo = Yunikua.nextDouble();
        System.out.println("Ingresa el costo de Spotify");
        MedusaBombero = Yunikua.nextDouble();
        System.out.println("Ingresa tu edad");
        Medusita = Yunikua.nextDouble();
        MedusaCantante = MedusaBailarina + MedusaIngeniera + MedusaModelo + MedusaBombero;
        if (Medusita < 30) {
            MedusaGrande = (MedusaCantante * 30/100);
            MedusaCantante = MedusaCantante - MedusaGrande;
            System.out.println("El valor total a pagar es" + " " + MedusaCantante);
        }
        else {
            System.out.println("El valor total a pagar es" + " " + MedusaCantante);
        }
    }   
}