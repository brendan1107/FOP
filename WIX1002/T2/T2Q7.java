package T2;

import java.util.Scanner;

public class T2Q7 {
    public static void main(String[] args) {
        System.out.println("Please enter the length in inch");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double meter = length * 2.54 / 100;
        System.out.printf("%.2f inches = %.2f meters", length, meter);
    }
}