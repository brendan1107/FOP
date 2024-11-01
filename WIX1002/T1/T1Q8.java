import java.util.Random;
import java.util.Scanner;

public class T1Q8 {
    public static void main(String[] args) {

        Random x = new Random();
        int bound =11;
        int num = x.nextInt(bound);
        System.out.println("A random number is generated:" + num);
        int count = 0; 
        boolean result = false; 
        Scanner y = new Scanner(System.in);
        
        while (!result) { System.out.println("Please enter your guess");
        int userInput = y.nextInt();
        if (num == userInput) {result = true;
        count++;}   
            else {System.out.println("Wrong guess, please try again!"); 
            count++;}
        }
    System.out.println("You guessed the correct number!");
    System.out.println("It took you " + count + "attempts!");
        
        

    }
}