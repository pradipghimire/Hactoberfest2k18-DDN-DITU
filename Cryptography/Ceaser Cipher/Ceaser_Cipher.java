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
    System.out.println("Enter your Text for encryption");
    String text=br.nextLine();
    System.out.println("Enter your Shift Number");
            int n=br.nextInt();
    System.out.println("Original Text :"+text);
      for(int i=0;i<text.length();i++)
      {
       c=text.charAt(i);
        ascii=(int)c;
         str+=Character.toString((char) ((char)ascii+n));

      }
      
      System.out.println("Text: "+text);
       System.out.println("Shift: "+n);
       System.out.println("Cipher: "+str);
       
        
                
          
      
         
      
      
      
      
    
}
}
