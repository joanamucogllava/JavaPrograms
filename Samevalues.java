/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samevalues;
import java.util.Scanner;
/**
 *
 * @author joana
 */
public class Samevalues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       System.out.print("Please enter the first number: ");
       int firstNumber = s.nextInt();
       System.out.print("Please enter the second number: ");
       double secondNumber = s.nextDouble();
       double devision = firstNumber/5.0;
       System.out.println("The result of devision is " + devision);
       double devision1 = secondNumber/5.0;
       System.out.println("The result of devision is " + devision1);
       
    }
    
}
