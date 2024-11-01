import java.util.Scanner;
public class T1Q5 {
    public static void main(String[] args) {
        System.out.println("Please enter the width of the rectangle");
        Scanner x = new Scanner(System.in);
        double num1 = x.nextDouble();

        System.out.println("Please enter the height of the rectangle");
        Scanner x2 = new Scanner(System.in);
        double num2 = x2.nextDouble();
        double perimeter;
        perimeter = 2 * num1 + 2* num2;
        System.out.println ("The perimeter of the rectangle is " + perimeter);
        x.close();
    }
}