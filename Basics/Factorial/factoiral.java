/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
import java.util.Collections;
/**
 *
 * @author ranjeet
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args) {
       char c;
       int ascii;
       String str = new String();
    Scanner br=new Scanner(System.in);
       System.out.println("Enter your Number");
       int n=br.nextInt();
       int f=1;
       for(int i=n;i>0;i--)
       {
           f=f*i;
       }
       System.out.println("Factorial of "+n+" : "+f);
       
        
                
          
      
         
      
      
      
      
    
}
}
