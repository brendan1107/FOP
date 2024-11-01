import java.util.Random;

public class T1Q2 {
    public static void main(String[] args) {
System.out.println("Generating a random number within zero and one hundred...");
Random x = new Random();
int MAX = 101;
int rand1 = x.nextInt(MAX);
System.out.println("The number generated is " + rand1);
if (rand1 > 50) { System.out.println ( "It is greater than 50");}
else if (rand1 < 50) {System.out.println ( "It is lesser than 50.");}
else if (rand1 == 50) {System.out.println (" It is equal to 50.");
    } 
    }
}