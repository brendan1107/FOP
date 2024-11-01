import java.text.DecimalFormat;
import java.util.Scanner;
public class L2Q1 {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Please enter the temperature in degree Fahrenheit");
double num1 = x.nextDouble();
double num2 = (num1 - 32) / 1.8; 
DecimalFormat decimalFormat = new DecimalFormat ("#.00");

System.out.println("The temperature in degree Celcius is " + decimalFormat.format(num2) );
    }
}