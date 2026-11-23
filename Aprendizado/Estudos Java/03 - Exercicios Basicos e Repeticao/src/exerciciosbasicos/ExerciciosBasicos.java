/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosbasicos;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author gabriel.fbcosta
 */
public class ExerciciosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        /*int[]listanumeros = {2,4,6,8};
        //int[]listanumeros2 = {1,3,5,7};
        
       int multiplicar = listanumeros[0]*listanumeros2[0];
        int soma = listanumeros [1]*listanumeros2[1];
        int divisão = listanumeros [2]/listanumeros2 [2];
        int subtração = listanumeros [3]-listanumeros2 [3];
        
        System.out.println("a multiplicação é igual a "+multiplicar);\
        
        Scanner digitar = new Scanner (System.in);
        .out.println("digite um produto");
        String produto = digitar.nextLine();
        
        String[]listaprodutos = new String[3];
        
        System.out.println("Informe o 1 produto");
       listaprodutos[0] = digitar.nextLine();
        System.out.println("informe o 2 produto");
       listaprodutos[1] = digitar.nextLine();
       System.out.println("informe o 3 produto");
       listaprodutos[2] = digitar.nextLine();
       System.out.println("informe o 4 produto");
       listaprodutos[3] = digitar.nextLine();*/
       
         Scanner digitar = new Scanner (System.in);
         System.out.println("digite um numero");
        
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println(contador + "Gabriel");
            
        }
 
        
        
        
    }
    
}
