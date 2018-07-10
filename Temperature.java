/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

/**
 *
 * @author mucog
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the celcius value:");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double celcius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 *celcius +32;
        System.out.println("Fahrenheit:"+fahrenheit);
    }
      
}
