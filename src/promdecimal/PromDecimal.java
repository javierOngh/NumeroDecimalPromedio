/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promdecimal;

import java.lang.*;
import java.lang.Double;
import java.util.Scanner;

/**
 *
 * @author naviret
 */
public class PromDecimal {

    //**     * @param args the command line arguments*/
     
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
        double suma = 0.00;
        double valores = 5;
        double num = 0.00;
                
     System.out.println("ingrese los 5 valores a evaluar");   
      for (int d = 0; d < valores; d++ ){
        num = Double.parseDouble(sc.next());
          if (num<0.00){
            while (true) {       
            System.out.println("El numero debe ser positivo:");
            num = Double.parseDouble(sc.next());
            if (num > 0){
                break;
            }
            } 
          }
        suma = suma + num;
        }
        
        System.out.println("El promedio de los valores es:"+suma/5);
        
    }
    
}
