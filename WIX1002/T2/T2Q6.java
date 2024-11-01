package T2;

import java.util.Scanner;

public class T2Q6 {
    public static void main(String[] args) {

        System.out.println("Please enter the diameter");
        Scanner sc = new Scanner(System.in);
        double diameter = sc.nextDouble();
        double circumference = 2 * Math.PI * diameter / 2;
        System.out.printf("\n The diameter is: %.3f", circumference);
    }
}