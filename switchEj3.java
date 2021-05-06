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
public class switchEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada= new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese un caracter y le diré si es una vocal");
        caracter= entrada.next().charAt(0);
        switch(caracter)
        {
            case 'A':System.out.println("El caracter es un vocal, es la A");
            break;
            case 'E':System.out.println("El caracter es un vocal, es la E");
            break;
            case 'I':System.out.println("El caracter es un vocal, es la I");
            break;
            case 'O':System.out.println("El caracter es una vocal. es la O");
            break;
            case 'U':System.out.println("El caracter es una  vocal, es la U");
            break;
            default:System.out.println("El caracter no es una vocal");
        }
    }
    
}
