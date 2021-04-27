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
public class abril22solucionesEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  key= new Scanner(System.in);
        int numero;
        int i=0;
        System.out.println("ingrese un número y se mostraran los múltiplos de 6 hasta dicho numero");
        numero=key.nextInt();
        do {
            if(i%6==0){
                System.out.println(i);
            } {
            i++;
        }
            }
            while(i<=numero);
    }
}

    
    