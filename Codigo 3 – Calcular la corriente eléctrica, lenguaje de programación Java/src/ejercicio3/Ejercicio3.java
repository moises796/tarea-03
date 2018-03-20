/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 14B06LA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double voltaje,resistencia,corriente;
        System.out.println("PROGRAMA PARA CALCULO DE CORRIENTE DE LA BATERIA DE LA MAQUINA DE TIEMPO");
        System.out.println("");
        System.out.println("¿DE CUANTO ES EL VOLTAJE DE LA BATERIA EN (Voltios)?");
        voltaje=leer.nextDouble();
        System.out.println("");
        System.out.println("¿DE CUANTO ES LA RESISTENCIA EN (Ohmns)?");
        resistencia=leer.nextDouble();
        corriente=voltaje/resistencia;
        System.out.println("LA CORRIENTE DE LA BATERIA ES DE: "+df.format(corriente)+" Amperios");
        
        
    }
    
}
