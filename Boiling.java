/*
This Program will ask you to enter a temperature degree and will tell you if the water is boiling or not.
 */
package boiling;

import java.util.Scanner;

/**
 *
 * @author Joana Mucogllava
 */
public class Boiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the temperature:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("the water is boiling.");
      } else {
            System.out.println("The water is not boiling.");
        }
    }
}
