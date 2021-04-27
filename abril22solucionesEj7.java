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
public class abril22solucionesEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key= new Scanner(System.in);
        int numero;
        System.out.println("ingrese un número y se mostraran los múltiplos de 6 hasta dicho numero");
        numero=key.nextInt();
        for(int i=0; i<=numero;i++){
            if (i%6==0){
                System.out.println(i);
            }
            
        }
    }
    
}
