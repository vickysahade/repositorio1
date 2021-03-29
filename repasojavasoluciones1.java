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
public class repasojavasoluciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner key = new Scanner (System.in);
        double horas;
        double costo;
        int mes;
        int año;
        System.out.println("para saber cuanto gana una persona al mes y al año ingrese las horas trabajadas y luego cuanto gana por hora: ");
        horas = key.nextDouble();
        costo = key.nextDouble();
        mes = 20;
        año = mes*12;
        System.out.println("gana " + (horas*costo)*mes + " al mes");
        System.out.println("y por año gana " + (horas*costo)*año);
    }
    
}
