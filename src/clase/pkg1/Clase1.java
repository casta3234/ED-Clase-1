/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase1 {

    public static int factorial (int n){
        if (n<= 1){ 
        return 1;
        }
        else
        return n* factorial(n-1);
        
   }
    public static int fibonnaci (int n){
        if (n<1){
            return 0;            
        }
        if (n==1){
            return 1;
        }
        else
            return fibonnaci(n-1)+fibonnaci(n-2);
    } 
    public static long pascal (int n ,int k){
    if (k==0 || k==n){
        return 1;
    }
    else
        return pascal (n-1,k-1)+ pascal(n-1,k);
    }
    public static String printInv(String s){
        if (s.length()==1){
            return s;
        }
        else{
            printInv(s.substring(1));
            String si += (s.charAt(0));
            return si;
        }
    }
    public static void palindromo () {
       String s;
       Scanner t = new Scanner(System.in);
       s = t.next();
        if (s.length()% 2 == 0 ){
           String pm = s.substring(0, (s.length()/2));
           String sm = printInv(s.substring((s.length()/2),s.length() ));
            if (pm.equals(sm)){
                System.out.println("es palindromo");
            }
            else
                System.out.println("no es palindromo");
        }
        else{
            String pm = s.substring(0, (s.length()/2));
            String sm = printInv(s.substring((s.length()/2)+1,s.length() ));
            if (pm.equals(sm)){
                System.out.println("es palindromo");
            }
            else
                System.out.println("no es palindromo");
        }
        
    }
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        //System.out.println(fibonnaci(10));
        //System.out.println(pascal(4,2));
        //for(int i =0; i<20 ;i++){
        //    for(int j=0; j<=i;j++){
        //        System.out.print(pascal(i, j)+" ");
        //    }
        //    System.out.print("\n");   
        //    
        //}
        //printInv("hola mundo");
        palindromo();
        
    }
    
}
