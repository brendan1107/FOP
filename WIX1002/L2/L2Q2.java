import java.text.DecimalFormat;
import java.util.Scanner;
public class L2Q2 {
    public static void main(String[] args) {
Scanner x = new Scanner(System.in);
System.out.println("Please enter the price of the car");
int priceCar = x.nextInt();
System.out.println("Please enter the down payment");
int downPayment = x.nextInt() ;
System.out.println("Please enter the interest rate in %");
double interestRate = x.nextDouble() ;
System.out.println("Please enter the loan duration in year");
int loanDuration = x.nextInt() ;
System.out.println("Processing......");
double monthlyPayment;
monthlyPayment = (priceCar - downPayment) * (1+ interestRate * loanDuration/100) / (loanDuration *12);
DecimalFormat decimalFormat = new DecimalFormat ("#.00");
System.out.println("The monthly payment is " + decimalFormat.format(monthlyPayment));
    x.close();
    }
}