import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hit the number!");
        System.out.println("The program will generate a random number. Try to hit the random number between 1 to 10. You have 5 chances to try!");

        int random = new Random().nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        int answer;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please, insert a number between 1 to 10");
            answer = scanner.nextInt();

            if (answer == random) {
                System.out.println("Congratulations!!! You match the number!!!");
                System.exit(0);
            }
            
            else {
                System.out.println("Nice try! But you didn't hit the number :(");
            }
        }

        System.out.println("Unfortunately you didn't hit any number...");
        System.out.println("The answer was " + random); 
    }
}