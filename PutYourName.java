/*
Author: Joana Mucogllava
This program will ask you for your name and it will greet you after that. 
 */
package putyourname;

import java.util.Scanner;

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
