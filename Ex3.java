/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeteste;

import java.util.Scanner;

/**
 *
 * @author pildo
 */
public class Ex3 {
    public static void main(String[] args) {
      int nota;  
        Scanner sc = new Scanner(System.in);
        do {System.out.println("Informe a nota:");
        nota = sc.nextInt();
        
        if (nota<=0 || nota>=11){
            System.out.println("Numero invalido");
            
            
        }else{
            System.out.println("Valor informado valido");
        }
        }while(nota<=0 || nota>=11);
            
           
            
            
            
            
        
       
        
    
    
    }
    
    
}
