
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
/**
 *
 * @author Usuario
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
       
        double C , F;
        
             
        System.out.println("Ingrese Los Grados Centigrados");
        
        C = leer.nextDouble();
               
        F= 32 + (9 * C / 5); 
        
        System.out.println("Los Grados Fahrenheit son: " + F); 
        
        
        
        
        
        
        
        
    }
    
}
