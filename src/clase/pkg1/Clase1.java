/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg1;

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
    public static void printInv(String s){
        if (s.length()==1){
            System.out.print(s);
        }
        else{
            printInv(s.substring(1));
            System.out.print(s.charAt(0));
        }
    } 
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonnaci(10));
        System.out.println(pascal(4,2));
        for(int i =0; i<20 ;i++){
            for(int j=0; j<=i;j++){
                System.out.print(pascal(i, j)+" ");
            }
            System.out.print("\n");   
            
        }
        printInv("hola mundo");
    }
    
}
