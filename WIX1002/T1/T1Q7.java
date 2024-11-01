import java.util.Random;
public class T1Q7 {
    public static void main(String[] args) {
        Random num = new Random();
        int loopCount= 10;
        int oddNum =0;
        int evenNum=0;
        while (loopCount >0) {
            int x = num.nextInt(90) +10;
            if (x % 2 == 0) { evenNum++; }
            else if (x %2 ==1) { oddNum ++;}
            loopCount--;
        }
        System.out.println ("Out of 10 random generated he number of odd numbers are " + oddNum + ", while the number of even numbers are " + evenNum);

    }
}