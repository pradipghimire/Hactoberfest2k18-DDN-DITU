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
       System.out.println("Enter your Number to search");
       int data=br.nextInt();
       
       int first=0;
       int last=arr.length-1;
      int mid=(first+last)/2;
      while(first<=last)
      { 
          
          if(arr[mid]==data)
          {
              System.out.println("Number found");  
              break;
          }
          if(arr[mid]<data)
          {
            first=mid+1;
          }
         
          else 
          {
             last=mid-1;
             
          }
          mid=(first+last)/2;
      }
           if(first>last)
             
               System.out.println("number not found");
               
             
          
      
         
      
      
      
      
    
}
}
