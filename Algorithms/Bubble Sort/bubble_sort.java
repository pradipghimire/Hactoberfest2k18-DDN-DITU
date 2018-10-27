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
    Scanner br=new Scanner(System.in);
    System.out.println("Enter array length");
       int n=br.nextInt();
    
        int [] arr=new int[n];
       
       System.out.println("Enter your Array");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=br.nextInt();
       }
       System.out.println("Sorting your array");
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                           
               }
           }
       }
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
       
     
          
      
         
      
      
      
      
    
}
}
