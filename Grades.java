/* 
Author: Joana Mucogllava
This program is going to take as an input a grade
and show as an output the evaluation of it depending
on the grade you have.
*/

package grades;


import java.util.Scanner;

public class Grades {

    public static void main (String[] args) {
        double grade1, grade2, grade3, avg, sum=0;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first Grade");
        grade1 = input.nextDouble();
        if (grade1 >= 90)
        {
            System.out.println("excellent");
            counter++;
            sum += grade1;
        }
        else if (grade1 < 90 && grade1 >= 70)
        {
            System.out.println("very good");
            counter++;
            sum += grade1;
        }
        else if (grade1 < 70 && grade1 >= 60)
        {
            System.out.println("fair");
            counter++;
            sum += grade1;
        }
        else if (grade1 < 60)
        {
            System.out.println("you fail");
        }
        System.out.println("Enter your second Grade");
        grade2 = input.nextDouble();
        if (grade2 >= 90)
        {
            System.out.println("excellent");
            counter++;
            sum += grade2;
        }
        else if (grade2 < 90 && grade2 >= 70)
        {
            System.out.println("very good");
            counter++;
            sum += grade2;
        }
        else if (grade2 < 70 && grade2 >= 60)
        {
            System.out.println("fair");
            counter++;
            sum += grade2;
        }
        else if (grade2 < 60)
            System.out.println("you fail");
        System.out.println("Enter your third Grade");
        grade3 = input.nextDouble();
        if (grade3 >= 90)
        {
            System.out.println("excellent");
            counter++;
            sum += grade3;
        }
        else if (grade3 < 90 && grade3 >= 70)
        {
            System.out.println("very good");
            counter++;
            sum += grade3;
        }
        else if (grade3 < 70 && grade3 >= 60)
        {
            System.out.println("fair");
            counter++;
            sum += grade3;
        }
        else if (grade3 < 60)
            System.out.println("you fail");
        avg=sum/counter;
        System.out.println("your average is : "+avg);


    }
}