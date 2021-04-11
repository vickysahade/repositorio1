/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author laptop
 */
public class repasoIIsoluciones2ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner (System.in);
        double radio;
        double longitud;
        double area;
        double pi = 3.1416; 
        System.out.println("ingrese el radio de una circunferencia: ");
        radio = key.nextDouble();
        longitud = 2 * pi * radio; 
        area = pi * Math.pow(radio, 2);
        System.out.println("la longitud de la circunferencia es de: " + longitud);
        System.out.println("el area de la circunferencia es: " + area);
    }
}
