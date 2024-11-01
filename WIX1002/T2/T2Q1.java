package T2;

import java.util.Scanner;

public class T2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a or b.");
        String input = sc.nextLine();

        if ("a".equals(input)) {
            System.out.print("Faculty of ");
            System.out.print("Computer Science and Information Technology");
        } else if ("b".equals(input)) {
            System.out.println("Faculty of \nComputer Science and \nInformation Technology");
        } else {
            System.out.println("invalid input");
        }

        sc.close();

    }
}