/*
  Author: Joana Mucogllava
  This program is created to change the temperature from Celcius degree to Fahrenheit.
 */
package temperature;

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
