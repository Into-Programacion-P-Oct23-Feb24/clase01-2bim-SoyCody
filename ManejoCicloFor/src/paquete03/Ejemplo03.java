/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;
import java.util.Locale;
public class Ejemplo03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String cadenaFinal = "";
        System.out.println("Digite el numero de jugadores que desea ingresar");
        int contador = entrada.nextInt();
        for (int i = 1; i <= contador; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion de juego");
            posicion = entrada.nextLine();
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese su estatura");
            estatura = entrada.nextDouble();
            cadenaFinal = String.format("%s%s. %s-, %s-, edad %s-, estatura %s\n", cadenaFinal, i, nombre, posicion, edad, estatura);  
        }
        System.out.printf("%s", cadenaFinal);
    }
}
