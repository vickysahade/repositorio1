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
public class repasoIIsoluciones1ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner (System.in);
        double velocidad;
        double resultado;
        System.out.println("ingrese una velocidad en km/h: ");
        velocidad = key.nextInt();
        resultado = velocidad / 3.6; 
        System.out.println("la velocidad en m/s es: " + resultado);
    }
    
}
