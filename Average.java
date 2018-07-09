/*
Author: Joana Mucogllava
This program is finding the average of the given numbers 
 */
 
package average;


public class Average {
    
    public static void main(String[] args) {
        int n=3,avg=0;
        int a[]=new int[3];
        a[0]=50;
        a[1]=90;
        a[2]=100;
        int i;
  
        for(i=0; i<n; i++){
            avg = avg + a[i];
        }
        
        System.out.println("average of ("+a[0]+", "+a[1]+", "+a[2]+") is = " + avg/n);
    }
    
}
