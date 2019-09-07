import java.util.Scanner;
import java.util.Random;

import javax.print.event.PrintJobListener;

/**
 * Testing some functions (methods) of Java
 *
 * In this code I am implementing a program that return the today's fortune of 
 * the user
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Simple fortune program"); 
        System.out.println("Please input your name: ");
        
        /* 
            I can declare a Scanner class like the example below:
            
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            But for the convenience I'm using another declaration to learn other forms of declaration
        */

        String name = new java.util.Scanner(System.in).nextLine();

        System.out.println("Next, please insert your age: ");
        Scanner input = new Scanner(System.in);
        String input_age = input.nextLine();
        int age = Integer.parseInt(input_age);

        int random_number = new Random().nextInt(4);
        String result = new String();

        switch(random_number) {
          case 0:
            result = "VERY BAD";
            break;
          case 1: 
            result = "BAD";
            break;
          case 2:
            result = "GOOD";
            break;
          case 3:
            result = "VERY GOOD";
            break;
        }

        System.out.println("Today's fortune of " + name + " is " + result);
    }
}
