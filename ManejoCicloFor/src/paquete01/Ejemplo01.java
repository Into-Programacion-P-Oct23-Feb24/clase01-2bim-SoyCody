/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valores = "";
        for (int i = 1; i <= 10; i++) {
            // System.out.printf("%d", i);
            valores = String.format("%s%d", valores, i);
        }
        
        for (int i = 1; i < 11; i++) {
            // System.out.printf("%d", i);
            valores = String.format("%s%d", valores, i);
        }
        System.out.printf("%s", valores);
        // se hace un solo system out printf ya que la variable i es una variable el cual se queda guardado con el valor que cada de los dos ciclos le dio
    }

}
