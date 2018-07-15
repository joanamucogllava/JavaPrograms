package billsncoins;
/*@author joana*/
import java.util.Scanner;

/*This program reads a double valued monetary amount. 
 * It determine the fewest number of each bill and coin needed to represent
 *  that amount, starting with the highest.
  
 */
public class Billsncoins {
	public static void main(String args[]){
		double price;
		int twenty, ten, five, one;
		int quarter, dime, nickel, penny;
		
	Scanner s= new Scanner (System.in);
	System.out.println("Please enter the amount:");
	price= s.nextDouble();
	
	 twenty= (int)price/20;	
	price=price%20;
	ten= (int)price/10;
	price=price%10;
	five= (int)price/5;			
	price=price%5;
	one= (int)price/1;			
	price=price%1;
	quarter= (int)(price/.25); 	
	price=price%.25;
	dime= (int)(price/.1);		
	price=price%.1;
	nickel= (int)(price/.5);	
	price=price%.5;
	penny= (int)(price/.01);	
	price=price%.01;
	
	
	System.out.println(twenty+ 	"Twenty $ bills");
	System.out.println(ten+ 	"Ten $ bills");
	System.out.println(five+ 	"Five $ bills");
	System.out.println(one+ 	"One $ bills");
	System.out.println(quarter+ "Quarters");		
	System.out.println(dime+ 	"Dimes");
	System.out.println(nickel+	"Nickels");
	System.out.println(penny+ 	"Pennies");
}
	
}