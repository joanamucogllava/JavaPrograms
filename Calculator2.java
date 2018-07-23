/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.pkg2;

import java.util.Scanner;

/**
 *
 * @author Joana Mucogllava
 */
public class Calculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integers to calculate their subtraction");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x - y;
        System.out.println("Substraction of the entered numbers" + z);
    }
    
}
