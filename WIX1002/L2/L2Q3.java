import java.text.DecimalFormat;
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
Random random = new Random();
int MAX =41;
int num1 = random.nextInt(MAX)+10;
int num2 = random.nextInt(MAX)+10;
int num3 = random.nextInt(MAX)+10;
int sum= num1 + num2 +num3;
System.out.println("The 3 random numbers generated are " +num1 + ", "+ num2  +", " +num3);
System.out.println("The sum of the numbers is " + sum);
DecimalFormat decimalFormat = new DecimalFormat("#.00");
double average = sum/3 ;
System.out.println("The average of numbers generated are " + decimalFormat.format(average));

    }
}