import java.util.Scanner;
public class L2Q6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of water in gram");
        double watergram= scanner.nextDouble();
        System.out.println("Please enter the initial temperature in Fahrenheit");
        double initialTemperature = scanner.nextDouble();
        System.out.println("Please enter the final temperature in Fahrenheit");
        double finalTemperature = scanner.nextDouble();
        double M = watergram /1000;
        double initialdegreeCelcius = (initialTemperature - 32) / 1.8;
        double finaldegreeCelcius = (finalTemperature - 32) / 1.8;
        System.out.println(M + " " + initialdegreeCelcius + " " + finaldegreeCelcius);
        
        double Q = M * (finaldegreeCelcius - initialdegreeCelcius) *4.184;

    System.out.printf("The energy needed is %.3f" ,Q);

       }
        
}