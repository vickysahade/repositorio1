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
public class switchEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner meses= new Scanner (System.in);
        System.out.println("ingrese un numero para saber que mes es del 1 al 12");
        int mes=meses.nextInt();
        String nommes;
        switch(mes)
            {case 1: nommes="Enero";
            break;
            case 2: nommes="Febrero";
            break;
            case 3: nommes="Marzo";
            break;
            case 4: nommes="Abril";
            break;
            case 5: nommes="Mayo";
            break;
            case 6: nommes="Junio";
            break;
            case 7: nommes="Julio";
            break;
            case 8: nommes="Agosto";
            break;
            case 9: nommes="Septiembre";
            break;
            case 10: nommes="Octubre";
            break;
            case 11: nommes="Noviembre";
            break;
            case 12: nommes="Diciembre";
            break;
            default: nommes="Mes invalido";
            break;
        }
        System.out.println(nommes);
    }
    
}
