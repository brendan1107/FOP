import java.util.Scanner;

public class T1Q1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        double Input1 = x.nextDouble();
        System.out.println("Please Enter the second number ");
        double Input2 = x.nextDouble();
        System.out.println("Type 1 for addition");
        System.out.println("Type 2 for subtraction");
        System.out.println("Type 3 for multiplication");
        System.out.println("Type 4 for division");
        System.out.println("Please select the operation");
        int Input3 = x.nextInt();
        String operation ="";
        double answer= 0;

        switch (Input3) {
            case 1:
                answer = (Input1 + Input2);
                operation = "addition";
                break;
            case 2:
                answer = (Input1 - Input2);
                operation = "subtraction";
                break;
            case 3:
                answer = (Input1 * Input2);
                operation = "multiplication";
                break;
            case 4:
                if (Input2 == 0) {System.out.println ("Error: Division of zero is not allowed.");
                x.close(); return;}
                answer = (Input1 / Input2);
                operation = "division";
                break;
            default:
                break;
        }

        System.out.println("Calculations on going, please wait...");
        System.out.println( "The " + operation +  " of " + Input1 + " and " + Input2 + " is " + answer );

    x.close();
    }
}

/* known bugs that I have trouble fixing:
1. user input invalid during Input1 , Input2 and Input3.
2. Overflow and underflow
3. Displaying decimals in answer
...... */