import java.util.Scanner;
public class L2Q4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of seconds");
    int seconds = scanner.nextInt();
    int minutes = 0;
    int hour = 0;
     while (seconds / 3600 >= 1) { hour++ ;
    seconds -= 3600; }
    while (seconds/ 60 >= 1) {minutes ++ ;
    seconds -= 60;}
    if (seconds < 60) {System.out.println(" The time is " +hour +" hours, " + minutes + " minutes and " + seconds + " seconds.");}
    }
}