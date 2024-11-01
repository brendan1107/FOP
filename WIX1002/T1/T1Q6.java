import java.util.Random;

public class T1Q6 {
    public static void main(String[] args) {
        int loopcount = 10 ;
        int min = 1000;

        Random num = new Random();
        while (loopcount > 0) {int rand = num.nextInt(1000);
        if (rand < min) {min = rand;} 
        loopcount--;
         }
         System.out.println ("The minimum number is " + min);
    }
}