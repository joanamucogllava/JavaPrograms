/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putyourname;

import java.util.Scanner;

/**
 *
 * @author mucog
 */
public class PutYourName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourName = input.nextLine();
        System.out.printf("Hello, %s!!!\n", yourName);
    }
    
    
}
