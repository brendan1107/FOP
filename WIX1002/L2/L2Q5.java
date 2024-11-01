import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10001); 
        System.out.println("Random number: " + randomNumber);
        System.out.println("Sum of the digits: " + getSum(randomNumber));
    }
    public static int getSum(int x) {
        int sum = 0;
        while (x!=0) { sum = sum +x %10;
        x= x /10; }
    return sum;

    }
}
