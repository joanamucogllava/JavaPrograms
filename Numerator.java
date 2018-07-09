/*
 * Author: Joana Mucogllava
 * This program gets 2 inputs and returns their sum, difference, product, and division results.
 * Also finds the bigger number and returns all the data to user.
 */
package numerator;

import java.util.Scanner;

public class Numerator {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        
        int number = reader.nextInt();
        int number2 = reader.nextInt();

        System.out.println("You entered: " + number + " and " + number2);
        
        int sum;
        sum = number + number2;
        
        System.out.println("The sum of the entered numbers is:" + sum);
        
        int difference;
        difference = number - number2;
        
        System.out.println("The difference of the two entered numberes is:" + difference);
        
        int product;
        product = number * number2;
        
        System.out.println("The product of the two entered numbers is:" + product);
        
        int division;
        division = number / number2;
        
        System.out.println("The division of the two entered numbers is:" + division);
        int large = 0;
        
        if(number > large);
        {
            large = number;
        }
        System.out.println("The largest number is:" + large);
    }
    
}
